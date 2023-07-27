package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.DongSPVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DongSPConfig {
    @Bean
    public DongSPVM getDSP(){
        DongSPVM dsp = new DongSPVM();
        return dsp;
    }
}
