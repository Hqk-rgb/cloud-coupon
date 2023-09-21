package top.whf.coupon.customer.dao.beans;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SearchCoupon
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCoupon {

    @NotNull
    private Long userId;

    private Long shopId;

    private Integer couponStatus;

}
