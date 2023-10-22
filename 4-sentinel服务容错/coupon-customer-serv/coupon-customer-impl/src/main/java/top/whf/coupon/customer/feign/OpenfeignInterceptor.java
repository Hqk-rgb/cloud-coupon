package top.whf.coupon.customer.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName OpenfeignInterceptor
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/22 14:02
 */
@Configuration
public class OpenfeignInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        template.header("SentinelSource","coupon-customer-serv");
    }
}
