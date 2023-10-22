package top.whf.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName Configuration
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/16 17:05
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    Logger.Level feignLogger(){return Logger.Level.FULL;}
}
