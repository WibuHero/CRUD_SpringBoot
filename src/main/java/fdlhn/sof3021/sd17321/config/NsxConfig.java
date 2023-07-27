package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.NSXVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NsxConfig {
    @Bean
    public NSXVM getNSX(){
        NSXVM nsx = new NSXVM();
        return nsx;
    }
}
