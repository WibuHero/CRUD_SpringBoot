package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity(name="HoaDonChiTiet")
@Table(name="HoaDonChiTiet")
@Getter
@Setter
@NoArgsConstructor
public class HoaDonChiTiet {
    @EmbeddedId
    private HDCTId id;
    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonGia")
    private double donGia;
}