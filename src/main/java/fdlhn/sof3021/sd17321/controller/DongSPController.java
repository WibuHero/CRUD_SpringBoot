package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.ChucVu;
import fdlhn.sof3021.sd17321.entities.DongSP;
import fdlhn.sof3021.sd17321.respositories.ChucVuRepo;
import fdlhn.sof3021.sd17321.respositories.DongSPRepo;
import fdlhn.sof3021.sd17321.viewModel.ChucVuVM;
import fdlhn.sof3021.sd17321.viewModel.DongSPVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("dongSP")
public class DongSPController {

    @Autowired
    private DongSPRepo repo;

    @Autowired
    private DongSPVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<DongSP> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "dongSP/indexDSP";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        vm.setMa("");
        vm.setTen("");
        model.addAttribute("dsp", vm);

        return "dongSP/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("dsp") DongSPVM vm, BindingResult result){

        if(result.hasErrors()){
            return "dongSP/create";
        }

        DongSP dspnew = new DongSP();

        dspnew.vmToEntity(vm);

        this.repo.save(dspnew);

        return "redirect:/dongSP/index";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")DongSP dsp){

        this.repo.delete(dsp);

        return "redirect:/dongSP/index";
    }

    @GetMapping("edit/{id}")
    public String getEdit(@PathVariable("id") DongSP dsp,Model model){

        vm.entityToVm(dsp);

        model.addAttribute("dsp", vm);
        model.addAttribute("action", "update/"+dsp.getId());
        return "dongSP/edit";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("cv") DongSPVM vm, @PathVariable("id") DongSP dsp, BindingResult result){

        if(result.hasErrors()){
            return "chucVu/edit"+dsp.getId();
        }

        dsp.vmToEntity(vm);

        this.repo.save(dsp);

        return "redirect:/dongSP/index";
    }
}
