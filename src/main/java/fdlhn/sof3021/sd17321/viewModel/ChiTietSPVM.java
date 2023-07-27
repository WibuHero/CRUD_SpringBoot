package fdlhn.sof3021.sd17321.viewModel;


import fdlhn.sof3021.sd17321.entities.ChiTietSP;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.NumberFormat;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChiTietSPVM {
    private UUID idSP;

    private UUID idNsx;

    private UUID idMs;

    private UUID idDsp;
    @Digits(integer=3, fraction=2)
    @Min(1) @Max(3)
    private int namBH;

    private String moTa;

    private int soLuongTon;

    private double giaNhap;

    private double giaBan;

    public void entityToVm(ChiTietSP ctsp){
        this.setNamBH(ctsp.getNamBH());
        this.setMoTa(ctsp.getMoTa());
        this.setSoLuongTon(ctsp.getSoLuongTon());
        this.setGiaNhap(ctsp.getGiaNhap());
        this.setGiaBan(ctsp.getGiaBan());
    }
}
