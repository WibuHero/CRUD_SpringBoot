package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.NhanVienVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NhanVienConfig {
    @Bean
    public NhanVienVM getNhanVien(){
        NhanVienVM nv = new NhanVienVM();
        return nv;
    }
}
