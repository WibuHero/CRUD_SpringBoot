package fdlhn.sof3021.sd17321.controller;


import fdlhn.sof3021.sd17321.entities.NSX;
import fdlhn.sof3021.sd17321.respositories.NsxRepo;

import fdlhn.sof3021.sd17321.viewModel.NSXVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("nsx")
public class NsxController {
    @Autowired
    private NsxRepo repo;

    @Autowired
    private NSXVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<NSX> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "nsx/indexNSX";
    }


    @GetMapping("create")
    public String getCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        model.addAttribute("nsx", vm);

        return "nsx/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nsx") NSXVM vm, BindingResult result){

        if(result.hasErrors()){
            return "nsx/create";
        }

        NSX nsx = new NSX();

        nsx.vmToEntity(vm);

        this.repo.save(nsx);

        return "redirect:/nsx/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")NSX nsx){

        this.repo.delete(nsx);

        return "redirect:/nsx/index";
    }

    @GetMapping("edit/{id}")
    public String getEdit(@PathVariable("id") NSX nsx, Model model){

        vm.entityToVm(nsx);

        model.addAttribute("nsx", vm);
        model.addAttribute("action", "update/"+nsx.getId());
        return "nsx/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("nsx") NSXVM vm, @PathVariable("id") NSX nsx, BindingResult result){



        if(result.hasErrors()){
            return "nsx/edit"+nsx.getId();
        }

        nsx.vmToEntity(vm);

        this.repo.save(nsx);

        return "redirect:/nsx/index";
    }
}
