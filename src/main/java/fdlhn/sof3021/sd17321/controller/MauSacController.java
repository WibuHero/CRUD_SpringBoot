package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.MauSac;

import fdlhn.sof3021.sd17321.respositories.MauSacRepo;
import fdlhn.sof3021.sd17321.viewModel.MauSacVM;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("mauSac")
public class MauSacController {
    @Autowired
    private MauSacRepo repo;

    @Autowired
    private MauSacVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<MauSac> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "mauSac/indexMS";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        model.addAttribute("ms", vm);

        return "mauSac/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ms") MauSacVM vm, BindingResult result){

        if(result.hasErrors()){
            return "mauSac/create";
        }

        MauSac ms = new MauSac();

        ms.vmToEntity(vm);

        this.repo.save(ms);

        return "redirect:/mauSac/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")MauSac ms){

        this.repo.delete(ms);

        return "redirect:/mauSac/index";
    }

    @GetMapping("edit/{id}")
    public String getEdit(@PathVariable("id") MauSac ms,Model model){

        vm.entityToVm(ms);

        model.addAttribute("ms", vm);
        model.addAttribute("action", "update/"+ms.getId());
        return "mauSac/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("ms") MauSacVM vm, @PathVariable("id") MauSac ms, BindingResult result){

        if(result.hasErrors()){
            return "mauSac/edit"+ms.getId();
        }

        ms.vmToEntity(vm);

        this.repo.save(ms);

        return "redirect:/mauSac/index";
    }
}
