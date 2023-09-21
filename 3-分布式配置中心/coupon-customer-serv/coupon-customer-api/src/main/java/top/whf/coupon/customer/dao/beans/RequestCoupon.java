package top.whf.coupon.customer.dao.beans;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName RequestCoupon
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:25
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCoupon {

    /**
     * 用户 id
     */
    @NotNull
    private Long userId;

    /**
     * 券模版 id
     */
    @NotNull
    private Long couponTemplatedId;

}
