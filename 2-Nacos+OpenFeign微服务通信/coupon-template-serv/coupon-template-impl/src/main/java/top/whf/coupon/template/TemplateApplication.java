package top.whf.coupon.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @ClassName ${NAME}
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 14:25
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.whf"})
@EnableJpaAuditing
public class TemplateApplication {
    public static void main(String[] args) {

        SpringApplication.run(TemplateApplication.class, args);

    }
}