package fdlhn.sof3021.sd17321.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class HDCTId implements Serializable {
    @Column(name = "IdHoaDon")
    private UUID idHoaDon;
    @Column(name = "IdChiTietSP")
    private UUID idChiTietSP;
}
