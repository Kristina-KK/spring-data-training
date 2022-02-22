package com.gridgain.training.spring.config;

import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.client.IgniteClient;
import org.apache.ignite.configuration.ClientConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IgniteConfig {
    @Bean(name = "igniteInstance")
    public Ignite igniteInstance(Ignite ignite) {
        return ignite;
    }

    @Bean
    public IgniteClient configurer() {
        return Ignition.startClient(new ClientConfiguration().setAddresses("127.0.0.1:10800"));
    }

//    @Bean
//    public IgniteConfigurer configurer() {
//        return igniteConfiguration -> {
//            igniteConfiguration.setClientMode(true);
//        };
//    }
}
