package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.SanPhamVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SanPhamConfig {
    @Bean
    public SanPhamVM getSanPham(){
        SanPhamVM sp = new SanPhamVM();
        return sp;
    }
}
