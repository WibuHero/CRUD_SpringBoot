package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.SanPham;
import fdlhn.sof3021.sd17321.respositories.SanPhamRepo;
import fdlhn.sof3021.sd17321.viewModel.SanPhamVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sanPham")
public class SanPhamController {
    @Autowired
    private SanPhamRepo repo;

    @Autowired
    private SanPhamVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<SanPham> sanPham = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", sanPham.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", sanPham.getTotalPages());
        model.addAttribute("hasNext", sanPham.hasNext());
        model.addAttribute("hasPrevious", sanPham.hasPrevious());
        model.addAttribute("isFirst", sanPham.isFirst());
        model.addAttribute("isLast", sanPham.isLast());
        return "sanPham/indexSP";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        model.addAttribute("sp", vm);

        return "sanPham/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("sp") SanPhamVM vm, BindingResult result){

        if(result.hasErrors()){
            return "sanPham/create";
        }

        SanPham sp = new SanPham();

        sp.vmToEntity(vm);

        this.repo.save(sp);

        return "redirect:/sanPham/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")SanPham sp){

        this.repo.delete(sp);

        return "redirect:/sanPham/index";
    }

    @GetMapping("edit/{id}")
    public String getEdit(@PathVariable("id") SanPham sp,Model model){

        vm.entityToVm(sp);

        model.addAttribute("sp", vm);
        model.addAttribute("action", "update/"+sp.getId());
        return "sanPham/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("sp") SanPhamVM vm, @PathVariable("id") SanPham sp, BindingResult result){

        if(result.hasErrors()){
            return "sanPham/edit";
        }

        sp.vmToEntity(vm);

        this.repo.save(sp);

        return "redirect:/sanPham/index";
    }
}
