package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity(name = "GioHang")
@Table(name="GioHang")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class GioHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "IdKH")
    private UUID idKH;
    @Column(name = "IdNV")
    private String idNV;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "NgayTao")
    private String ngayTao;
    @Column(name = "NgayThanhToan")
    private String ngayThanhToan;
    @Column(name = "TenNguoiNhan")
    private String tenNguoiNhan;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "SDT")
    private String sdt;
    @Column(name = "TinhTrang")
    private int tinhTrang;
}