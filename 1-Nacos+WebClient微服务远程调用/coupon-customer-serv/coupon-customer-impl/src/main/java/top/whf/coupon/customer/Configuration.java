package top.whf.coupon.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @ClassName Configuration
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/14 09:16
 */
@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * 注册一个 WebClient的实例来远程调用
     * @return WebClient.builder()
     */
    @Bean
    @LoadBalanced
    public WebClient.Builder register(){
        return WebClient.builder();
    }
}
