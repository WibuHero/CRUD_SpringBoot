package fdlhn.sof3021.sd17321.controller;


import fdlhn.sof3021.sd17321.entities.ChucVu;
import fdlhn.sof3021.sd17321.entities.CuaHang;
import fdlhn.sof3021.sd17321.entities.NhanVien;
import fdlhn.sof3021.sd17321.entities.SanPham;
import fdlhn.sof3021.sd17321.respositories.ChucVuRepo;
import fdlhn.sof3021.sd17321.respositories.CuaHangRepo;
import fdlhn.sof3021.sd17321.respositories.NhanVienRepo;
import fdlhn.sof3021.sd17321.viewModel.NhanVienVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@RequestMapping("nhanVien")
public class NhanVienController {
    @Autowired
    private NhanVienRepo nhanVienRepo;

    @Autowired
    private NhanVienVM vm;

    @Autowired
    private CuaHangRepo chRepo;

    @Autowired
    private ChucVuRepo cvRepo;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){
        int pageSize = 10;

        Page<NhanVien> nhanViens = nhanVienRepo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", nhanViens.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", nhanViens.getTotalPages());
        model.addAttribute("hasNext", nhanViens.hasNext());
        model.addAttribute("hasPrevious", nhanViens.hasPrevious());
        model.addAttribute("isFirst", nhanViens.isFirst());
        model.addAttribute("isLast", nhanViens.isLast());
        return "nhanVien/indexNV";
    }
//
    @GetMapping("create")
    public String getFormCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        vm.setTenDem("");
        vm.setHo("");
        vm.setNgaySinh("");
        vm.setDiaChi("");
        vm.setGioiTinh("Nam");
        vm.setMatKhau("");
        vm.setSdt("");
        vm.setTrangThai(0);
        model.addAttribute("cv", cvRepo.findAll());
        model.addAttribute("ch", chRepo.findAll());
        model.addAttribute("nv", vm);
        return "nhanVien/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nv") NhanVienVM vm, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("cv", cvRepo.findAll());
            model.addAttribute("ch", chRepo.findAll());
            return "nhanVien/create";
        }

        NhanVien nv = new NhanVien();

        nv.vmToEntity(vm);
        Optional<ChucVu> cv = this.cvRepo.findById(vm.getCv());
        nv.setCv(cv.get());
        Optional<CuaHang> ch = this.chRepo.findById(vm.getCh());
        nv.setCh(ch.get());

        this.nhanVienRepo.save(nv);
        return "redirect:/nhanVien/index";
    }
//
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") NhanVien nv){
        this.nhanVienRepo.delete(nv);
        return "redirect:/nhanVien/index";
    }
//
    @GetMapping("edit/{id}")
    public String getFormEdit(Model model, @PathVariable("id") NhanVien nv){
        vm.entityToVm(nv);

        model.addAttribute("cv", cvRepo.findAll());
        model.addAttribute("ch", chRepo.findAll());
        model.addAttribute("nv", vm);
        model.addAttribute("action", "update/" + nv.getId());
        return "nhanVien/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("nv") NhanVienVM vm, @PathVariable("id") NhanVien nv, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("cv", cvRepo.findAll());
            model.addAttribute("ch", chRepo.findAll());
            return "nhanVien/update";
        }

        nv.vmToEntity(vm);
        Optional<ChucVu> cv = this.cvRepo.findById(vm.getCv());
        nv.setCv(cv.get());
        Optional<CuaHang> ch = this.chRepo.findById(vm.getCh());
        nv.setCh(ch.get());

        this.nhanVienRepo.save(nv);
        return "redirect:/nhanVien/index";
    }
}
