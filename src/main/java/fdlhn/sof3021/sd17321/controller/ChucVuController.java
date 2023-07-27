package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.ChucVu;
import fdlhn.sof3021.sd17321.respositories.ChucVuRepo;
import fdlhn.sof3021.sd17321.viewModel.ChucVuVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("chucVu")
public class ChucVuController {

    @Autowired
    private ChucVuRepo repo;

    @Autowired
    private ChucVuVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<ChucVu> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "chucVu/indexCV";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        model.addAttribute("cv", vm);

        return "chucVu/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("cv") ChucVuVM vm, BindingResult result){

        if(result.hasErrors()){
            return "chucVu/create";
        }

        ChucVu cv = new ChucVu();

        cv.vmToEntity(vm);

        this.repo.save(cv);

        return "redirect:/chucVu/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")ChucVu cv){

        this.repo.delete(cv);

        return "redirect:/chucVu/index";
    }

    @GetMapping("edit/{id}")
    public String getEdit(@PathVariable("id") ChucVu cv,Model model){

        vm.entityToVm(cv);

        model.addAttribute("cv", vm);
        model.addAttribute("action", "update/"+cv.getId());
        return "chucVu/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("cv") ChucVuVM vm, @PathVariable("id") ChucVu cv, BindingResult result){

        if(result.hasErrors()){
            return "chucVu/edit"+cv.getId();
        }

        cv.vmToEntity(vm);

        this.repo.save(cv);

        return "redirect:/chucVu/index";
    }
}
