package top.whf.coupon.template.converter;

import top.whf.coupon.template.api.beans.CouponTemplateInfo;

/**
 * @ClassName CouponTemplateConverter
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:00
 */
public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(top.whf.coupon.template.dao.entity.CouponTemplate template) {

        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
