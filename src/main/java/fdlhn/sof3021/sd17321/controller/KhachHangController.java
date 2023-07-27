package fdlhn.sof3021.sd17321.controller;


import fdlhn.sof3021.sd17321.entities.KhachHang;
import fdlhn.sof3021.sd17321.respositories.KhachHangRepo;
import fdlhn.sof3021.sd17321.viewModel.KhachHangVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("khachHang")
public class KhachHangController {
    @Autowired
    private KhachHangRepo repo;

    @Autowired
    private KhachHangVM vm;


    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<KhachHang> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "khachHang/indexKH";
    }

    @GetMapping("create")
    public String create(Model model){
        vm.setMa("");
        vm.setHo("");
        vm.setTen("");
        vm.setTenDem("");
        vm.setMatKhau("");
        vm.setThanhPho("");
        vm.setQuocGia("");
        vm.setNgaySinh("");
        vm.setSdt("");
        vm.setDiaChi("");
        model.addAttribute("kh", vm);
        return "khachHang/create";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id")KhachHang kh, Model model){
        vm.entityToVm(kh);
        model.addAttribute("kh", vm);
        model.addAttribute("action", "update/"+kh.getId());
        return "khachHang/edit";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh") KhachHangVM khvm, BindingResult result){
        if(result.hasErrors()){
            return "khachHang/create";
        }
        KhachHang kh = new KhachHang();
        kh.vmToEntity(khvm);

        repo.save(kh);
        return "redirect:/khachHang/index";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("kh") KhachHangVM khvm, @PathVariable("id") KhachHang kh, BindingResult result){
        if(result.hasErrors()){
            return "khachHang/edit"+kh.getId();
        }

        kh.vmToEntity(khvm);

        repo.save(kh);
        return "redirect:/khachHang/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") KhachHang kh){
        repo.delete(kh);
        return "redirect:/khachHang/index";
    }
}
