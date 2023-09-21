package top.whf.coupon.customer.converter;

import top.whf.coupon.customer.dao.entity.Coupon;
import top.whf.coupon.template.api.beans.CouponInfo;

/**
 * @ClassName CouponConverter
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:39
 */
public class CouponConverter {
    public static CouponInfo convertToCoupon(Coupon coupon){
        return CouponInfo.builder()
                .id(coupon.getId())
                .status(coupon.getStatus().getCode())
                .templateId(coupon.getTemplateId())
                .shopId(coupon.getShopId())
                .userId(coupon.getUserId())
                .template(coupon.getTemplateInfo())
                .build();
    }


}
