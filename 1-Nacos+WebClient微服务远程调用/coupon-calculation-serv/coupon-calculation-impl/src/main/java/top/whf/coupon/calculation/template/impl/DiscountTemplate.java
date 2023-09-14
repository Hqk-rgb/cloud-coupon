package top.whf.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.whf.coupon.calculation.template.AbstractRuleTemplate;
import top.whf.coupon.calculation.template.RuleTemplate;

/**
 * @ClassName DiscountTemplate
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:49
 * 打折优惠券
 */

@Slf4j
@Component
public class DiscountTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        //计算使用优惠券之后的价格
        Long newPrice = convertToDecimal(shopAmount * (quota.doubleValue() / 100));
        log.debug("origin price = {}, new price = {}",totalAmount,newPrice);
        return newPrice;
    }
}
