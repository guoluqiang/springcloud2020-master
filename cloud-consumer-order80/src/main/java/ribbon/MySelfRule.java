package ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yan
 * @Title: MySelfRule
 * @ProjectName cloud2020
 * @Description: TODO
 * @data 2022-03-29上午 11:42
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule MyRule(){
        return new RandomRule();
    }
}
