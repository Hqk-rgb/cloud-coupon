package top.whf.coupon.customer.dao.converter;


import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import top.whf.coupon.customer.dao.enums.CouponStatus;

/**
 * @ClassName CouponStatusConverter
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:31
 */
@Converter
public class CouponStatusConverter implements AttributeConverter<CouponStatus, Integer> {
    /**
     * enum 转 DB value
     *
     * @param status enum
     * @return Integer
     */
    @Override
    public Integer convertToDatabaseColumn(CouponStatus status) {
        return status.getCode();
    }

    /**
     * DB value 转 enum 值
     *
     * @param code DB value
     * @return CouponStatus
     */
    @Override
    public CouponStatus convertToEntityAttribute(Integer code) {
        return CouponStatus.convert(code);
    }
}
