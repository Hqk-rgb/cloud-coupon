package top.whf.coupon.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName CustomApplication
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/9 10:38
 */
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = "top.whf")
@EnableTransactionManagement
//用于扫描 Dao @Repository 注解
@EnableJpaRepositories(basePackages = {"top.whf"})
//用于扫描 JPA实体类 @Entity，默认扫本包当下路径
@EntityScan(basePackages = {"top.whf"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"top.whf"})
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
