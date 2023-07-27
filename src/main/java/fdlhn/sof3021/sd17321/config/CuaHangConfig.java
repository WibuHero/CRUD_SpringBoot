package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.CuaHangVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CuaHangConfig {
    @Bean
    public CuaHangVM getCuaHang(){
        CuaHangVM ch = new CuaHangVM();

        return ch;
    }
}
