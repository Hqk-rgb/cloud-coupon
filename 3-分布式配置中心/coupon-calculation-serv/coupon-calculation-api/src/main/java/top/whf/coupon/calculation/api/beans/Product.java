package top.whf.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    /**
     * 商铺 id
     */
    private Long productId;
    /**
     * 商品价格
     */
    private Long price;
    /**
     * 商品在购物车里的数量
     */
    private Integer count;
    /**
     * 商品销售的门店 id
     */
    private Long shopId;
}
