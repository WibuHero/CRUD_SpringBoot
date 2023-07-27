package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.SanPham;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SanPhamVM {
    @NotBlank(message = "Không để trống")
    private String ma;

    @NotBlank(message = "Không để trống")
    private String ten;

    public void entityToVm(SanPham sp){
        this.setMa(sp.getMa());
        this.setTen(sp.getTen());
    }
}
