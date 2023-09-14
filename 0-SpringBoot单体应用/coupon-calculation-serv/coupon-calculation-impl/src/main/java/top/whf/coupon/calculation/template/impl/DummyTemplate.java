package top.whf.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.whf.coupon.calculation.api.beans.ShoppingCart;
import top.whf.coupon.calculation.template.AbstractRuleTemplate;
import top.whf.coupon.calculation.template.RuleTemplate;

/**
 * @ClassName DummyTemplate
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:49
 * 空实现
 */
@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        //获取订单总价
        long orderTotalAmount = getTotalPrice(order.getProducts());
        order.setCost(orderTotalAmount);
        return order;
    }

    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}
