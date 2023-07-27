package fdlhn.sof3021.sd17321.controller;


import fdlhn.sof3021.sd17321.entities.CuaHang;
import fdlhn.sof3021.sd17321.respositories.CuaHangRepo;
import fdlhn.sof3021.sd17321.viewModel.CuaHangVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;


@Controller
@RequestMapping("cuaHang")
public class CuaHangController {

    @Autowired
    private CuaHangRepo cuaHangRepo;

    @Autowired
    private CuaHangVM ch;

    private CuaHangVM setBegin(CuaHangVM ch){
        ch.setMa("");
        ch.setTen("");
        ch.setDiaChi("");
        ch.setThanhPho("");
        ch.setQuocGia("");
        return ch;
    }

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<CuaHang> ds = cuaHangRepo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "cuaHang/indexCH";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") CuaHang che, Model model){

        ch.entityToVM(che);

        model.addAttribute("ch", ch);
        model.addAttribute("action", "update/"+che.getId());
        return "cuaHang/edit";
    }
    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("ch") CuaHangVM vm, @PathVariable("id") CuaHang ch){

        ch.vmToEntity(vm);

        this.cuaHangRepo.save(ch);

        return "redirect:/cuaHang/index";
    }


    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") CuaHang ch){

        this.cuaHangRepo.delete(ch);

        return "redirect:/cuaHang/index";
    }

    @GetMapping("create")
    public String create(Model model){
        setBegin(ch);
        model.addAttribute("ch", ch);
        return "cuaHang/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") CuaHangVM vm,
                        BindingResult result)
    {
        if(result.hasErrors()){
            return "cuaHang/create";
        }
        CuaHang che = new CuaHang();

        che.vmToEntity(vm);

        this.cuaHangRepo.save(che);

        return "redirect:/cuaHang/index";
    }
}
