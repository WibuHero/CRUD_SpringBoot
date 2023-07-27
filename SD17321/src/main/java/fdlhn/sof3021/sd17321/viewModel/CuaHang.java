package fdlhn.sof3021.sd17321.viewModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHang {
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ten;
    @NotBlank(message = "Không được để trống")
    private String diaChi;
    @NotBlank(message = "Không được để trống")
    private String thanhPho;
    @NotBlank(message = "Không được để trống")
    private String quocGia;


}
