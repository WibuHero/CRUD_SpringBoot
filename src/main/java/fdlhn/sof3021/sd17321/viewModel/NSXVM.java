package fdlhn.sof3021.sd17321.viewModel;


import fdlhn.sof3021.sd17321.entities.NSX;
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
public class NSXVM {
    @Size(message = "Không để trống")
    private String ma;


    @Size(min = 1,message = "Không để trống")
    private String ten;

    public void entityToVm(NSX nsx){
        this.setMa(nsx.getMa());
        this.setTen(nsx.getTen());
    }
}
