package fdlhn.sof3021.sd17321.viewModel;

import fdlhn.sof3021.sd17321.entities.CuaHang;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CuaHangVM {

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

    public void entityToVM(CuaHang ch)
    {
        this.setMa( ch.getMa() );
        this.setTen( ch.getTen() );
        this.setThanhPho( ch.getThanhPho() );
        this.setQuocGia( ch.getQuocGia() );
        this.setDiaChi( ch.getDiaChi() );
    }
}
