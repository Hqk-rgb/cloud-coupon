package top.whf.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName CalculationApplication
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/8 16:51
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.whf"})
public class CalculationApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculationApplication.class, args);
    }
}
