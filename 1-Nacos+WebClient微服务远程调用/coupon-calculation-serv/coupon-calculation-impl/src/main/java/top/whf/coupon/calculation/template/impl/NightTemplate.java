package top.whf.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.whf.coupon.calculation.template.AbstractRuleTemplate;
import top.whf.coupon.calculation.template.RuleTemplate;

import java.util.Calendar;

/**
 * @ClassName LonelyNightTemplate
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:49
 * @Description 午夜10点到次日凌晨2点之间下单，优惠金额翻倍
 */
@Slf4j
@Component
public class NightTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        Calendar calendar = Calendar.getInstance();
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

        if (hourOfDay >= 23 || hourOfDay < 2){
            quota *= 2;
        }
        Long benefitAmount = shopTotalAmount < quota ? shopTotalAmount : quota;
        return orderTotalAmount - benefitAmount;
    }
}
