package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="GioHangChiTiet")
@Table(name="GioHangChiTiet")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GioHangChiTiet {
    @EmbeddedId
    private GHCTId id;
    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonGia")
    private double donGia;
    @Column(name = "DonGiaKhiGiam")
    private double donGiaKhiGiam;
}
