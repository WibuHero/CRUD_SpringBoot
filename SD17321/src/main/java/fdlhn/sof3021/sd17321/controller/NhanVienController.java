package fdlhn.sof3021.sd17321.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("nhanVien")
public class NhanVienController {
    private ArrayList<NhanVien> repo;

    public NhanVienController() {
        this.repo = new ArrayList<>();
        this.repo.add(new NhanVien("NV001", "Cộng", "Quang", "Nguyễn",  "Nam", "06/05/2003","Bắc Ninh", "0123456789", "nqc12345", "SamSung", "Quản lý", "OK"));
        this.repo.add(new NhanVien("NV002", "Cộng", "Quang", "Nguyễn", "Nam", "06/05/2003", "Bắc Ninh", "0123456789", "nqc12345", "SamSung", "Nhân viên", "Not OK"));
    }

    @GetMapping("index")
    public String getIndex(Model model){
        model.addAttribute("ds", this.repo);
        return "nhanVien/index";
    }

    @GetMapping("create")
    public String getFormCreate(Model model){
        NhanVien nv = new NhanVien();
        model.addAttribute("nv", nv);
        return "nhanVien/create";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("nv") NhanVien nv, BindingResult result){
        if(result.hasErrors()){
            return "nhanVien/create";
        }
        this.repo.add(nv);
        return "redirect:/nhanVien/index";
    }

    @GetMapping("delete/{ma}")
    public String delete(@PathVariable String ma){
        for(int i = 0; i <repo.size(); i++){
            if(ma.equals(repo.get(i).getMa())){
                repo.remove(i);
            }
        }
        return "redirect:/nhanVien/index";
    }

    @GetMapping("edit/{ma}")
    public String getFormEdit(Model model, @PathVariable String ma){
        NhanVien nv = new NhanVien();
        for(int i = 0; i <repo.size(); i++){
            if(repo.get(i).getMa().equalsIgnoreCase(ma)){
                nv = repo.get(i);
            }
        }
        model.addAttribute("nv", nv);
        return "nhanVien/edit";
    }

    @PostMapping("edit/update/{ma}")
    public String update(NhanVien nv, @PathVariable String ma){
//        if(result.hasErrors()){
//            return "nhanVien/update";
//        }
        for(int i = 0; i <repo.size(); i++){
            if(repo.get(i).getMa().equals(ma)){
                repo.set(i, nv);
            }
        }
        return "redirect:/nhanVien/index";
    }
}
