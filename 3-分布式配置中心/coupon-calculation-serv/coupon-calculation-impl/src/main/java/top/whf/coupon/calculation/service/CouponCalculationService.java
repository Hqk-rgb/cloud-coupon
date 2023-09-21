package top.whf.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import top.whf.coupon.calculation.api.beans.ShoppingCart;
import top.whf.coupon.calculation.api.beans.SimulationOrder;
import top.whf.coupon.calculation.api.beans.SimulationResponse;

/**
 * @ClassName CouponCalculationService
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:47
 */
public interface CouponCalculationService {
    /**
     * 订单价格计算
     * @param cart 购物车
     * @return 计算结果
     */
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    /**
     * 订单价格试算
     * @param cart 购物车
     * @return 试算结果
     */
    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
