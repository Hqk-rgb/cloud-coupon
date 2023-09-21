package top.whf.coupon.template.dao.converter;


import top.whf.coupon.template.api.enums.CouponType;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

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
