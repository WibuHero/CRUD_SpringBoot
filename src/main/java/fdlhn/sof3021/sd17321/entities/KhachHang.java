package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.KhachHangVM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Entity(name = "KhachHang")
@Table(name = "KhachHang")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ho")
    private String ho;
    @Column(name = "TenDem")
    private String tenDem;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "ThanhPho")
    private String thanhPho;
    @Column(name = "QuocGia")
    private String quocGia;
    @Column(name = "MatKhau")
    private String matKhau;

    public void vmToEntity(KhachHangVM kh){
        this.setMa(kh.getMa());
        this.setHo(kh.getHo());
        this.setTenDem(kh.getTenDem());
        this.setTen(kh.getTen());
        this.setDiaChi(kh.getDiaChi());
        this.setNgaySinh(kh.getNgaySinh());
        this.setSdt(kh.getSdt());
        this.setThanhPho(kh.getThanhPho());
        this.setQuocGia(kh.getQuocGia());
        this.setMatKhau(kh.getMatKhau());
    }
}
