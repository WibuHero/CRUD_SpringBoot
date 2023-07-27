package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.*;
import fdlhn.sof3021.sd17321.respositories.*;
import fdlhn.sof3021.sd17321.viewModel.ChiTietSPVM;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("chiTietSP")
public class ChiTietSPController {
    @Autowired
    private ChiTietSPRepo repo;

    @Autowired
    private SanPhamRepo spRepo;

    @Autowired
    private NsxRepo nsxRepo;

    @Autowired
    private MauSacRepo msRepo;

    @Autowired
    private DongSPRepo dspRepo;

    @Autowired
    private ChiTietSPVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){


        int pageSize = 10;

        Page<ChiTietSP> ds = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", ds.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", ds.getTotalPages());
        model.addAttribute("hasNext", ds.hasNext());
        model.addAttribute("hasPrevious", ds.hasPrevious());
        model.addAttribute("isFirst", ds.isFirst());
        model.addAttribute("isLast", ds.isLast());
        return "ctsp/indexCTSP";
    }

    @GetMapping("create")
    public String create(Model model){
        vm.setNamBH(0);
        vm.setMoTa("");
        vm.setSoLuongTon(0);
        vm.setGiaNhap(0);
        vm.setGiaBan(0);
        model.addAttribute("sp", spRepo.findAll());
        model.addAttribute("nsx", nsxRepo.findAll());
        model.addAttribute("ms", msRepo.findAll());
        model.addAttribute("dsp", dspRepo.findAll());
        model.addAttribute("ctsp", vm);
        return "ctsp/create";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id")ChiTietSP ctsp){
        repo.delete(ctsp);
        return "redirect:/chiTietSP/index";
    }

    @GetMapping("edit/{id}")
    public String edit(Model model, @Valid @PathVariable("id") ChiTietSP ctsp){
        vm.entityToVm(ctsp);
        vm.setIdSP(ctsp.getSp().getId());
        vm.setIdDsp(ctsp.getDsp().getId());
        vm.setIdMs(ctsp.getMs().getId());
        vm.setIdNsx(ctsp.getNsx().getId());
        model.addAttribute("sp", spRepo.findAll());
        model.addAttribute("nsx", nsxRepo.findAll());
        model.addAttribute("ms", msRepo.findAll());
        model.addAttribute("dsp", dspRepo.findAll());
        model.addAttribute("ctsp", vm);
        model.addAttribute("action", "update/"+ctsp.getId());

        return "ctsp/edit";
    }

    @PostMapping("store")
    public String store(@Valid @ModelAttribute("ctsp")ChiTietSPVM ctspvm, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("sp", spRepo.findAll());
            model.addAttribute("nsx", nsxRepo.findAll());
            model.addAttribute("ms", msRepo.findAll());
            model.addAttribute("dsp", dspRepo.findAll());
            return "ctsp/create";
        }

        ChiTietSP ctsp = new ChiTietSP();

        ctsp.vmToEntity(ctspvm);
        MauSac ms = msRepo.findById(ctspvm.getIdMs()).get();
        SanPham sp = spRepo.findById(ctspvm.getIdSP()).get();
        NSX nsx = nsxRepo.findById(ctspvm.getIdNsx()).get();
        DongSP dsp = dspRepo.findById(ctspvm.getIdDsp()).get();

        ctsp.setMs(ms);
        ctsp.setSp(sp);
        ctsp.setNsx(nsx);
        ctsp.setDsp(dsp);
        repo.save(ctsp);
        return "redirect:/chiTietSP/index";
    }

    @PostMapping("edit/update/{id}")
    public String update(@Valid @ModelAttribute("ctsp")ChiTietSPVM ctspvm, BindingResult result, Model model, @PathVariable("id") ChiTietSP ctsp){
        if(result.hasErrors()){
            model.addAttribute("sp", spRepo.findAll());
            model.addAttribute("nsx", nsxRepo.findAll());
            model.addAttribute("ms", msRepo.findAll());
            model.addAttribute("dsp", dspRepo.findAll());
            return "ctsp/edit"+ctsp.getId();
        }

        ctsp.vmToEntity(ctspvm);
        MauSac ms = msRepo.findById(ctspvm.getIdMs()).get();
        SanPham sp = spRepo.findById(ctspvm.getIdSP()).get();
        NSX nsx = nsxRepo.findById(ctspvm.getIdNsx()).get();
        DongSP dsp = dspRepo.findById(ctspvm.getIdDsp()).get();

        ctsp.setMs(ms);
        ctsp.setSp(sp);
        ctsp.setNsx(nsx);
        ctsp.setDsp(dsp);
        repo.save(ctsp);
        return "redirect:/chiTietSP/index";
    }
}
