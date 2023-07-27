package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.NhanVien;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NhanVienVM {

    @NotBlank(message = "Không để trống")
    @Size(max = 7, message = "Mã không quá 7 kí tự ")
    private String ma;
    @NotBlank(message = "Không được để trống")
    private String ten;
    @NotBlank(message = "Không được để trống")
    private String tenDem;
    @NotBlank(message = "Không được để trống")
    private String ho;
    @NotEmpty(message = "Chọn 1 trạng thái")
    private String gioiTinh;
    @NotBlank(message = "Không được để trống")
//    @DateTimeFormat(pattern = "yyyy-mm-dd")
    private String ngaySinh;
    @NotBlank(message = "Không được để trống")
    private String diaChi;
    @NotBlank(message = "Không được để trống")
    private String sdt;
    @NotBlank(message = "Không được để trống")
    private String matKhau;
    @NotNull
    private UUID ch;
    @NotNull
    private UUID cv;
    @NotNull
    private int trangThai;

    public void entityToVm(NhanVien nv){
        this.setMa(nv.getMa());
        this.setTen(nv.getTen());
        this.setTenDem(nv.getTenDem());
        this.setHo(nv.getHo());
        this.setNgaySinh(nv.getNgaySinh());
        this.setDiaChi(nv.getDiaChi());
        this.setGioiTinh(nv.getGioiTinh());
        this.setMatKhau(nv.getMatKhau());
        this.setSdt(nv.getSdt());
        this.setCh(nv.getCh().getId());
        this.setCv(nv.getCv().getId());
        this.setTrangThai(nv.getTrangThai());
    }
}
