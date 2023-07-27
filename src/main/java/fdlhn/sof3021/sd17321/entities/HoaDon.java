package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity(name="HoaDon")
@Table(name="HoaDon")
@Getter
@Setter
@NoArgsConstructor
public class HoaDon {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "IdKH")
    private UUID idKH;
    @Column(name = "IdNV")
    private UUID idNV;
    @Column(name = "Ma")
    private String ma;
    @Column(name = "NgayTao")
    private Date ngayTao;
    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;
    @Column(name = "NgayShip")
    private Date ngayShip;
    @Column(name = "NgayNhan")
    private Date ngayNhan;
    @Column(name = "TinhTrang")
    private int tinhTrang;
    @Column(name = "TenNguoiNhan")
    private String tenNguoiNhan;
    @Column(name = "DiaChi")
    private String diaChi;
    @Column(name = "Sdt")
    private String sdt;
}