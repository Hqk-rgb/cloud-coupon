package top.whf.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.whf.coupon.calculation.template.AbstractRuleTemplate;
import top.whf.coupon.calculation.template.RuleTemplate;

import java.util.Random;

/**
 * @ClassName RandomReductionTemplate
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:50
 * 随机减优惠券
 */
@Slf4j
@Component
public class RandomReductionTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
        //计算使用优惠券之后的价格
        long maxBenefit = Math.min(shopAmount,quota);
        int reductionAmount = new Random().nextInt((int) maxBenefit);
        Long newCost = totalAmount - reductionAmount;
        log.debug("original price = {}, new price = {}", totalAmount,newCost);
        return newCost;
    }
}
