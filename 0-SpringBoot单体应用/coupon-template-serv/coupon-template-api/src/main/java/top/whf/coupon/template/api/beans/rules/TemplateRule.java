package top.whf.coupon.template.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TemplateRule
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {
    /**
     * 可以享受的折扣
     */
    private Discount discount;
    /**
     * 每个人最多可以领券的数量
     */
    private Integer limitation;
    /**
     * 过期时间
     */
    private Long deadline;
}
