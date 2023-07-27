package fdlhn.sof3021.sd17321.viewModel;


import fdlhn.sof3021.sd17321.entities.MauSac;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MauSacVM {
    @NotBlank(message = "Không để trống")
    private String ma;

    @NotBlank(message = "Không để trống")
    private String ten;

    public void entityToVm(MauSac ms){
        this.setMa(ms.getMa());
        this.setTen(ms.getTen());
    }
}
