package fdlhn.sof3021.sd17321.controller;

import fdlhn.sof3021.sd17321.entities.ChiTietSP;
import fdlhn.sof3021.sd17321.entities.GioHang;
import fdlhn.sof3021.sd17321.entities.GioHangChiTiet;
import fdlhn.sof3021.sd17321.entities.SanPham;
import fdlhn.sof3021.sd17321.respositories.*;
import fdlhn.sof3021.sd17321.viewModel.ChiTietSPVM;
import fdlhn.sof3021.sd17321.viewModel.SanPhamVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("shop")
public class BanHangController {
    private UUID idKH = UUID.fromString("05871E66-79F5-4EE7-86AE-6250B81B3B15");

    @Autowired
    private ChiTietSPRepo repo;

    @Autowired
    private GioHangRepo gioHangRepo;

    @Autowired
    private HoaDonRepo hoaDonRepo;

    @Autowired
    private HoaDonChiTietRepo hdctRepo;

    @Autowired
    private GioHangChiTietRepo ghctRepo;

    @Autowired
    private ChiTietSPVM vm;

    @GetMapping("index")
    public String getIndex(Model model, @RequestParam(defaultValue = "0") int page){



        int pageSize = 10;

        Page<ChiTietSP> sanPham = repo.findAll(PageRequest.of(page, pageSize));

        model.addAttribute("ds", sanPham.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", sanPham.getTotalPages());
        model.addAttribute("hasNext", sanPham.hasNext());
        model.addAttribute("hasPrevious", sanPham.hasPrevious());
        model.addAttribute("isFirst", sanPham.isFirst());
        model.addAttribute("isLast", sanPham.isLast());
        return "banHang/banHang";
    }

    @GetMapping("gioHang")
    public String themGioHang(Model model, @RequestParam(defaultValue = "0") int page){

        int pageSize = 10;

        Page<GioHangChiTiet> sanPham = ghctRepo.findAllByIdGH(PageRequest.of(page, pageSize));

        model.addAttribute("ds", sanPham.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", sanPham.getTotalPages());
        model.addAttribute("hasNext", sanPham.hasNext());
        model.addAttribute("hasPrevious", sanPham.hasPrevious());
        model.addAttribute("isFirst", sanPham.isFirst());
        model.addAttribute("isLast", sanPham.isLast());


        return "banHang/gioHang";
    }
}
