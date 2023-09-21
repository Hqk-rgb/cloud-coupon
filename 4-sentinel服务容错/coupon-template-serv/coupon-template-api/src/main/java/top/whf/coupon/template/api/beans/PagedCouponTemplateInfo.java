package top.whf.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName PagedCouponTemplateInfo
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagedCouponTemplateInfo {
    public List<CouponTemplateInfo> templates;
    public int page;
    public long total;
}
