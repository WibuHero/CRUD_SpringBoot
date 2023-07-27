package fdlhn.sof3021.sd17321.viewModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Component
public class GioHangVM {
    private UUID idGH;
    private UUID idCtsp;
    private int soLuong;
    private double donGia;
    private double donGiaKhiGiam;
}
