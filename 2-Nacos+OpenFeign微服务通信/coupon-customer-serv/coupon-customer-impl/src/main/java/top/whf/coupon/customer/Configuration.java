package top.whf.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName Configuration
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/14 11:10
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * 注册一个 WebClient的实例来远程调用
     * @return WebClient.builder()
     */
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
