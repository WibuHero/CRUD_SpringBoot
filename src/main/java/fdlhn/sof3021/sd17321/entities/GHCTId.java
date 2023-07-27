package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GHCTId implements Serializable {
    @Column(name = "IdGioHang")
    private UUID idGioHang;
    @Column(name = "IdChiTietSP")
    private UUID idChiTietSP;
}
