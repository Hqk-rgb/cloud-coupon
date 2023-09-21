package top.whf.coupon.customer.feign.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import top.whf.coupon.customer.feign.TemplateService;
import top.whf.coupon.template.api.beans.CouponTemplateInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TemplateServiceFallbackFactory
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/16 17:09
 */
@Slf4j
@Component
public class TemplateServiceFallbackFactory implements FallbackFactory<TemplateService> {
    @Override
    public TemplateService create(Throwable cause) {
        return new TemplateService(){
            @Override
            public CouponTemplateInfo getTemplate(Long id) {
                log.info("根据id获取优惠券模板降级逻辑"+cause);
                return CouponTemplateInfo.builder().id(123L).name("降级优惠卷").desc("一张降级优惠").type("折扣").shopId(123L).rule(null).available(true).build();
            }

            @Override
            public Map<Long, CouponTemplateInfo> getTemplateInBatch(Collection<Long> ids) {
                log.info("批量获取优惠卷模板降级逻辑"+cause);
                Map<Long, CouponTemplateInfo> map=new HashMap<>();
                map.put(1L,CouponTemplateInfo.builder().id(123L).name("降级优惠卷").desc("一张降级优惠").type("折扣").shopId(123L).rule(null).available(true).build());
                return map;
            }
        };
    }
}
