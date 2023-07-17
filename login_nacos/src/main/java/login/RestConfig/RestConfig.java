package login.RestConfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate resttemplate(){
        return new RestTemplate();
    }
}
