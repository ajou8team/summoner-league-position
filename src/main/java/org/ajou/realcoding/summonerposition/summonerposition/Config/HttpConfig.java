package org.ajou.realcoding.summonerposition.summonerposition.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HttpConfig {

    @Bean
    public RestTemplate createRestTemple()
    {
        return new RestTemplate();
    }
}
