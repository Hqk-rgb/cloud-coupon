package top.whf.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.whf.coupon.customer.dao.entity.Coupon;

/**
 * @ClassName CouponDao
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:31
 */
public interface CouponDao extends JpaRepository<Coupon,Long> {
    /**
     *  计算
     * @param userId
     * @param templateId
     * @return
     */
    long countByUserIdAndTemplateId(Long userId,Long templateId);
}
