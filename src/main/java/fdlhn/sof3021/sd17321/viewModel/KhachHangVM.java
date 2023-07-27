package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.KhachHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KhachHangVM {
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
    private String matKhau;

    public void entityToVm(KhachHang kh){
        this.setMa(kh.getMa());
        this.setHo(kh.getHo());
        this.setTenDem(kh.getTenDem());
        this.setTen(kh.getTen());
        this.setDiaChi(kh.getDiaChi());
        this.setNgaySinh(kh.getNgaySinh());
        this.setSdt(kh.getSdt());
        this.setThanhPho(kh.getThanhPho());
        this.setQuocGia(kh.getQuocGia());
        this.setMatKhau(kh.getMatKhau());
    }
}
