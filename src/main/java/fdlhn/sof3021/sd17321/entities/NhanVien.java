package fdlhn.sof3021.sd17321.entities;

import fdlhn.sof3021.sd17321.viewModel.ChucVuVM;
import fdlhn.sof3021.sd17321.viewModel.CuaHangVM;
import fdlhn.sof3021.sd17321.viewModel.NhanVienVM;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Entity(name = "NhanVien")
@Table(name = "NhanVien")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class NhanVien {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Column(name = "TenDem")
    private String tenDem;
    @Column(name = "Ho")
    private String ho;
    @Column(name = "GioiTinh")
    private String gioiTinh;
    @Column(name = "NgaySinh")
    private String ngaySinh;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCH", referencedColumnName = "Id")
    private CuaHang ch;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCV", referencedColumnName = "Id")
    private ChucVu cv;
    @Column(name = "IdGuiBC")
    private String idGuiBC;
    @Column(name = "TrangThai")
    private int trangThai;

    public void vmToEntity(NhanVienVM nv){

        this.setMa(nv.getMa());
        this.setTen(nv.getTen());
        this.setTenDem(nv.getTenDem());
        this.setHo(nv.getHo());
        this.setNgaySinh(nv.getNgaySinh());
        this.setDiaChi(nv.getDiaChi());
        this.setGioiTinh(nv.getGioiTinh());
        this.setMatKhau(nv.getMatKhau());
        this.setSdt(nv.getSdt());
        this.setTrangThai(nv.getTrangThai());
    }
}
