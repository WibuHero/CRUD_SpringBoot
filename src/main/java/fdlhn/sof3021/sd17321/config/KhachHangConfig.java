package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.KhachHangVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KhachHangConfig {
    @Bean
    public KhachHangVM getKH(){
        KhachHangVM vm = new KhachHangVM();
        return vm;

    }
}
