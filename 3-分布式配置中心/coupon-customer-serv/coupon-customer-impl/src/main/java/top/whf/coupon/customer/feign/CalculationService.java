package top.whf.coupon.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import top.whf.coupon.calculation.api.beans.ShoppingCart;
import top.whf.coupon.calculation.api.beans.SimulationOrder;
import top.whf.coupon.calculation.api.beans.SimulationResponse;

/**
 * @ClassName CalculationService
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/16 17:07
 */
@FeignClient(value = "coupon-calculation-serv",path = "/calculator")
public interface CalculationService {
    /**
     * 优惠卷结算
     * @param shoppingCart
     * @return
     */
    @PostMapping("/checkout")
    ShoppingCart checkout(ShoppingCart shoppingCart);

    @PostMapping("/simulate")
    SimulationResponse simulate(SimulationOrder simulationOrder);
}
