package top.whf.coupon.template.dao.converter;

import com.alibaba.fastjson.JSON;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import top.whf.coupon.template.api.beans.rules.TemplateRule;

/**
 * @ClassName RuleConverter
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:42
 */
@Converter
public class RuleConverter implements AttributeConverter<TemplateRule,String> {
    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule,TemplateRule.class);
    }
}
