package fdlhn.sof3021.sd17321.viewModel;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Component
public class KhachHang {
    @NotBlank(message = "Không để trống")
    private String ma;
    @NotBlank(message = "Không để trống")
    private String ho;
    @NotBlank(message = "Không để trống")
    private String tenDem;
    @NotBlank(message = "Không để trống")
    private String ten;
    @NotBlank(message = "Không để trống")
    private String ngaySinh;
    @NotBlank(message = "Không để trống")
    private String sdt;
    @NotBlank(message = "Không để trống")
    private String diaChi;
    @NotBlank(message = "Không để trống")
    private String thanhPho;
    @NotBlank(message = "Không để trống")
    private String quocGia;
    @NotBlank(message = "Không để trống")
    private String mk;
}
