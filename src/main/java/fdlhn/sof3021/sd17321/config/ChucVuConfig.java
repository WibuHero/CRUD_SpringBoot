package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.ChucVuVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChucVuConfig {
    @Bean
    public ChucVuVM getChucVu(){
        ChucVuVM cv = new ChucVuVM();
        return cv;
    }
}
