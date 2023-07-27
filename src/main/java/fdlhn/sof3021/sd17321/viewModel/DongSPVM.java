package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.DongSP;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DongSPVM {
    @NotBlank(message = "Không để trống")
    private String ma;

    @NotBlank(message = "Không để trống")
    private String ten;

    public void entityToVm(DongSP dsp){
        this.setMa(dsp.getMa());
        this.setTen(dsp.getTen());
    }
}
