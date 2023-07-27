package fdlhn.sof3021.sd17321.entities;


import fdlhn.sof3021.sd17321.viewModel.ChiTietSPVM;
import fdlhn.sof3021.sd17321.viewModel.DongSPVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name = "ChiTietSP")
@Table(name = "ChiTietSP")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSP {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSP", referencedColumnName = "Id")
    private SanPham sp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNsx", referencedColumnName = "Id")
    private NSX nsx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdMauSac", referencedColumnName = "Id")
    private MauSac ms;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdDongSP", referencedColumnName = "Id")
    private DongSP dsp;

    @Column(name = "NamBH")
    private int namBH;

    @Column(name = "Mota")
    private String moTa;

    @Column(name = "SoLuongTon")
    private int soLuongTon;

    @Column(name = "GiaNhap")
    private double giaNhap;

    @Column(name = "GiaBan")
    private double giaBan;

    public void vmToEntity(ChiTietSPVM ctsp){
        this.setNamBH(ctsp.getNamBH());
        this.setMoTa(ctsp.getMoTa());
        this.setSoLuongTon(ctsp.getSoLuongTon());
        this.setGiaNhap(ctsp.getGiaNhap());
        this.setGiaBan(ctsp.getGiaBan());
    }
}
