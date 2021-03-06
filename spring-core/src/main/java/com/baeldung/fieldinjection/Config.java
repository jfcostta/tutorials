package com.baeldung.fieldinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.baeldung.constructordi.domain.Engine;
import com.baeldung.constructordi.domain.Transmission;

@Configuration
@ComponentScan("com.baeldung.constructordi.domain")
public class Config {

    @Bean
    public Engine engine() {
        return new Engine("v2", 1);
    }

    @Bean
    public Transmission transmission() {
        return new Transmission("cvt");
    }
}
