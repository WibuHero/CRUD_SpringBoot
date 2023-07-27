package fdlhn.sof3021.sd17321.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CuaHangConfig {
    @Bean
    public CuaHang getCuaHang(){
        CuaHang ch = new CuaHang();
        ch.setMa("CH001");
        ch.setTen("CH1");
        return ch;
    }
}
