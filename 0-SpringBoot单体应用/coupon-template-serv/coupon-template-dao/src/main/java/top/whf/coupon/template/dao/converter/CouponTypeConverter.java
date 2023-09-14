package top.whf.coupon.template.dao.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import top.whf.coupon.template.api.enums.CouponType;

/**
 * @ClassName CouponTypeConverter
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:42
 */
@Converter
public class CouponTypeConverter implements AttributeConverter<CouponType,String> {


    @Override
    public String convertToDatabaseColumn(CouponType couponCategory) {
        return couponCategory.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String code) {
        return CouponType.convert(code);
    }
}
