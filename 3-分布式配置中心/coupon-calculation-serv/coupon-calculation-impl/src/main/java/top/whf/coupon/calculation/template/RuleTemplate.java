package top.whf.coupon.calculation.template;

import top.whf.coupon.calculation.api.beans.ShoppingCart;

/**
 * @ClassName RuleTemplate
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:51
 * @Description RuleTemplate - 模板规则接口
 */
public interface RuleTemplate {
    /**
     * 计算优惠券
     *
     * @param settlement 传入的参数
     * @return 优惠券计算结果
     */
    ShoppingCart calculate(ShoppingCart settlement);
}
