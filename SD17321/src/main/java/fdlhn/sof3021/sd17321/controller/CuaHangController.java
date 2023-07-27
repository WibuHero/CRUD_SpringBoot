package fdlhn.sof3021.sd17321.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("cuaHang")
public class CuaHangController {

    private CHRepo repo;
    @Autowired
    private CuaHang ch;

    public CuaHangController() {
        repo = new CHRepo();
    }

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("ds", repo.getAll());
        return "cuaHang/index";
    }

//    @GetMapping("create")
//    public String create(){
//        return "cuaHang/create";
//    }
//    @PostMapping("store")
//    public String store(CuaHang ch){
//        this.repo.insert(ch);
//        return "redirect:/cuaHang/index";
//    }
//
    @GetMapping("edit/{ma}")
    public String edit(@PathVariable String ma, Model model){

        CuaHang ch = repo.findByMa(ma);

        model.addAttribute("ch", ch);
        return "cuaHang/edit";
    }
    @PostMapping("edit/update/{ma}")
    public String update(CuaHang ch){
        this.repo.update(ch);

        return "redirect:/cuaHang/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable String ma){

        CuaHang ch = repo.findByMa(ma);

        repo.delete(ch);

        return "redirect:/cuaHang/index";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("ch", ch);
        return "cuaHang/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ch") CuaHang ch,
                        BindingResult result)
    {
        if(result.hasErrors()){
            return "cuaHang/create";
        }
        this.repo.insert(ch);

        return "redirect:/cuaHang/index";
    }
}
