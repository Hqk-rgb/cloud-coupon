package top.whf.coupon.calculation.api.beans;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.whf.coupon.template.api.beans.CouponInfo;

import java.util.List;

/**
 * @ClassName SimulationOrder
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {

    @NotEmpty
    private List<Product> products;

    @NotEmpty
    private List<Long> couponIDs;

    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;


}
