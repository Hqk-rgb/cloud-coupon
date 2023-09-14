package top.whf.coupon.customer.dao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @ClassName CouponStatus
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:26
 */
@Getter
@AllArgsConstructor
public enum CouponStatus {

    AVAILABLE("未使用", 1),
    USED("已用", 2),
    INACTIVE("已经注销", 3);

    private final String desc;
    private final Integer code;

    public static CouponStatus convert(Integer code) {
        if (code == null) {
            return null;
        }
        return Stream.of(values())
                .filter(bean -> bean.code.equals(code))
                .findAny()
                .orElse(null);
    }
}
