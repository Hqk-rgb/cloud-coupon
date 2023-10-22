package top.whf.coupon.template;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @ClassName SentinelOriginParser
 * @Description TODO
 * @Author Dr.king
 * @Date 2023/9/22 14:04
 */
@Component
@Slf4j
public class SentinelOriginParser implements RequestOriginParser {
    @Override
    public String parseOrigin(HttpServletRequest request) {
        log.info("request {} ,header = {}",request.getParameterMap(),request.getHeaderNames());
        return request.getHeader("SentinelSource");
    }
}
