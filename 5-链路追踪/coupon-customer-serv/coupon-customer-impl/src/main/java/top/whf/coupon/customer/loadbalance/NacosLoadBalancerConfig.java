//package top.whf.coupon.customer.loadbalance;
//
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
//import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
//import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
//import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
//
///**
// * @ClassName NacosLoadBalancerConfig
// * @Description TODO
// * @Author Dr.king
// * @Date 2023/9/16 17:05
// */
//@LoadBalancerClients(defaultConfiguration = NacosLoadBalancerConfig.class)
//public class NacosLoadBalancerConfig {
//    @Bean
//    public ReactorLoadBalancer<ServiceInstance> reactorLoadBalancer(Environment environment, LoadBalancerClientFactory loadBalancerClientFactory){
//        String name = environment.getProperty(LoadBalancerClientFactory.PROPERTY_NAME);
//        return  new NacosWeightRandomLoadBalancer(loadBalancerClientFactory.getLazyProvider(name, ServiceInstanceListSupplier.class),name);
//    }
//}
