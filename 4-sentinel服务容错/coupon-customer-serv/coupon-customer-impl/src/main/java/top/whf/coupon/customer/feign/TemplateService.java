package top.whf.coupon.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.whf.coupon.customer.feign.fallback.TemplateServiceFallbackFactory;
import top.whf.coupon.template.api.beans.CouponTemplateInfo;

import java.util.Collection;
import java.util.Map;

/**
 * @ClassName TemplateService
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/16 17:08
 */
@FeignClient(value = "coupon-template-serv",path = "/template",fallbackFactory = TemplateServiceFallbackFactory.class)
public interface TemplateService {
    //读取优惠券
    @GetMapping("/getTemplate")
    CouponTemplateInfo getTemplate(@RequestParam("id")Long id);

    //批量获取
    @GetMapping("/getBatch")
    Map<Long,CouponTemplateInfo> getTemplateInBatch(@RequestParam("ids")Collection<Long> ids);
}
