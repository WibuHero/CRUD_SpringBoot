package fdlhn.sof3021.sd17321.viewModel;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVien {
    @NotBlank(message = "Không được để trống")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ten;
    @NotBlank(message = "Không được để trống")
    private String tenDem;
    @NotBlank(message = "Không được để trống")
    private String ho;
    @NotNull(message = "Chọn 1 trạng thái")
    private String gioiTinh;
    @NotBlank(message = "Không được để trống")
    private String ngaySinh;
    @NotBlank(message = "Không được để trống")
    private String diaChi;
    @NotBlank(message = "Không được để trống")
    private String sdt;
    @NotBlank(message = "Không được để trống")
    private String matKhau;
    @NotBlank(message = "Không được để trống")
    private String tenCH;
    @NotBlank(message = "Không được để trống")
    private String tenCV;
    private String trangThai;

}
