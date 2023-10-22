package top.whf.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CouponInfo
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:15
 * @Description 封装优惠券信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInfo {
    private Long id;
    private Long templateId;
    private Long userId;
    private Long shopId;
    private Integer status;
    private CouponTemplateInfo template;
}
