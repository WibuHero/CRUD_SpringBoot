package fdlhn.sof3021.sd17321.config;

import fdlhn.sof3021.sd17321.viewModel.MauSacVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MauSacConfig {
    @Bean
    public MauSacVM getMS(){
        MauSacVM vm = new MauSacVM();
        return vm;
    }
}
