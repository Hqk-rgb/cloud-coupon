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
 * @Date 2023/9/14 11:13
 */
@FeignClient(value = "coupon-calculation-serv",path = "/calculation")
public interface CalculationService {
    /**
     * 优惠券结算
     *
     * @param settlement 结算对象
     * @return 结算结果
     */
    @PostMapping("/checkout")
    ShoppingCart checkout(ShoppingCart settlement);

    /**
     * 优惠券结算
     *
     * @param simulator 结算对象
     * @return 试算响应对象
     */
    @PostMapping("/simulate")
    SimulationResponse simulate(SimulationOrder simulator);

}
