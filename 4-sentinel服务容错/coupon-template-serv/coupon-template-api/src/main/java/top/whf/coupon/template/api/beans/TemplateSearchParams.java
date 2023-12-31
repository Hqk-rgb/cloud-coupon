package top.whf.coupon.template.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName TemplatesSearchParams
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 15:19
 * @Description 封装查询参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {
    private Long id;
    private  String name;
    private String type;
    private Long shopId;
    private Boolean available;
    private int page;
    private int pageSize;
}
