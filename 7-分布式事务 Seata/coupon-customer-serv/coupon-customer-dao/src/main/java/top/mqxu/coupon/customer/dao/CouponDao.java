package top.mqxu.coupon.customer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import top.mqxu.coupon.customer.api.enums.CouponStatus;
import top.mqxu.coupon.customer.dao.entity.Coupon;

/**
 * @author moqi
 */
public interface CouponDao extends JpaRepository<Coupon, Long> {

    long countByUserIdAndTemplateId(Long userId, Long templateId);

    @Modifying
    @Query("update Coupon c set c.status = :status where c.templateId = :templateId")
    int deleteCouponInBatch(@Param("templateId") Long templateId, @Param("status")CouponStatus status);
}