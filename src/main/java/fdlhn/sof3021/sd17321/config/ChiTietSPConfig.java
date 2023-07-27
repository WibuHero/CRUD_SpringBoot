package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.ChiTietSPVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChiTietSPConfig {
    @Bean
    public ChiTietSPVM getCTSP(){
        ChiTietSPVM vm = new ChiTietSPVM();
        return vm;
    }
}
