package top.whf.coupon.customer.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.whf.coupon.calculation.api.beans.ShoppingCart;
import top.whf.coupon.calculation.api.beans.SimulationOrder;
import top.whf.coupon.calculation.api.beans.SimulationResponse;
import top.whf.coupon.customer.dao.beans.RequestCoupon;
import top.whf.coupon.customer.dao.beans.SearchCoupon;
import top.whf.coupon.customer.dao.entity.Coupon;
import top.whf.coupon.customer.service.CouponCustomerService;
import top.whf.coupon.template.api.beans.CouponInfo;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @ClassName CouponCustomerController
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:39
 */
@Slf4j
@RestController
@RequestMapping("coupon-customer")
public class CouponCustomerController {
    @Resource
    private CouponCustomerService customerService;

    @PostMapping("requestCoupon")
    public Coupon requestCoupon(@Valid @RequestBody RequestCoupon request) {
        return customerService.requestCoupon(request);
    }

    /**
     * 用户删除优惠券
     *
     * @param userId   用户id
     * @param couponId 优惠券id
     */
    @DeleteMapping("deleteCoupon")
    public void deleteCoupon(@RequestParam("userId") Long userId,
                             @RequestParam("couponId") Long couponId) {
        customerService.deleteCoupon(userId, couponId);
    }

    /**
     * 用户模拟计算每个优惠券的优惠价格
     *
     * @param order 订单信息
     * @return 优惠券模板信息
     */
    @PostMapping("simulateOrder")
    public SimulationResponse simulate(@Valid @RequestBody SimulationOrder order) {
        return customerService.simulateOrderPrice(order);
    }

    /**
     * 下单核销优惠券
     *
     * @param info 订单信息
     * @return 优惠券模板信息
     */
    @PostMapping("placeOrder")
    public ShoppingCart checkout(@Valid @RequestBody ShoppingCart info) {
        return customerService.placeOrder(info);
    }


    /**
     * 查询用户优惠券
     *
     * @param request 查询条件
     * @return 优惠券模板信息
     */
    @PostMapping("findCoupon")
    public List<CouponInfo> findCoupon(@Valid @RequestBody SearchCoupon request) {
        return customerService.findCoupon(request);
    }
}
