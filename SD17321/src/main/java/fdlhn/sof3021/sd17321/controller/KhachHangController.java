package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.viewModel.KhachHang;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("khachHang")
public class KhachHangController {
    private ArrayList<KhachHang> ds;
    @Autowired
    private KhachHang kh;

    public KhachHangController() {
        this.ds = new ArrayList<>();
        this.ds.add(new KhachHang("KH001","Nguyễn","Quang","Cộng","06/05/2003","03666666666","Bắc Ninh","Hà Nội","Việt Nam", "nqc2003"));
        this.ds.add(new KhachHang("KH002","Nguyễn","Quang","Cộng","06/05/2003","03666666666","Bắc Ninh","Hà Nội","Việt Nam", "nqc2003"));
    }

    @GetMapping("index")
    public String getIndex(Model model){
        model.addAttribute("ds", this.ds);
        return "khachHang/indexKH";
    }

    @GetMapping("create")
    public String getCreate(Model model){
        model.addAttribute("kh", kh);
        return "khachHang/create";
    }
    @PostMapping("store")
    public String store(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult result){

        if(result.hasErrors()){
            return "khachHang/create";
        }
        this.ds.add(kh);
        return "redirect:/khachHang/index";
    }


    @GetMapping("edit/{ma}")
    public String getEdit(@PathVariable String ma, Model model){
        for(int i = 0; i <ds.size(); i++){
            if(ds.get(i).getMa().equalsIgnoreCase(ma)){
                kh = ds.get(i);
            }
        }
        model.addAttribute("kh", kh);
        return "khachHang/edit";
    }
    @PostMapping("edit/update/{ma}")
    public String update(@Valid @ModelAttribute("kh") KhachHang kh, BindingResult result){
        if(result.hasErrors()){
            return "khachHang/edit"+ kh.getMa();
        }
        for(int i = 0; i <ds.size(); i++){
            if(kh.getMa().equals(ds.get(i).getMa())){
                ds.set(i, kh);
            }
        }
        return "redirect:/khachHang/index";
    }

    @GetMapping("delete/{ma}")
    public String getDelete(@PathVariable String ma){
        for(int i = 0; i <ds.size(); i++){
            if(ma.equals(ds.get(i).getMa())){
                ds.remove(i);
            }
        }

        return "redirect:/khachHang/index";
    }
}
