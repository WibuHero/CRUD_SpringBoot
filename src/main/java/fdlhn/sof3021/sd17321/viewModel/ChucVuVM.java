package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.ChucVu;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChucVuVM {
    @NotBlank(message = "Không để trống")
    @Size(min = 0, max = 20, message = "Độ dài từ 0 đến 20")
    private String ma;

    @NotBlank(message = "Không để trống")
    @Size(min = 0, max = 50, message = "Độ dài từ 0 đến 50")
    private String ten;

    public void entityToVm(ChucVu cv){
        this.setMa(cv.getMa());
        this.setTen(cv.getTen());
    }
}
