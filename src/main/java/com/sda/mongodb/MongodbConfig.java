package com.sda.mongodb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories (basePackageClasses = CatRepository.class)
@Configuration
public class MongodbConfig {

    @Bean
    CommandLineRunner comandLineRunner(CatRepository catRepository){
        return new CommandLineRunner(){
            @Override
            public void  run (String... args) throws Exception {
                catRepository.save(new Cat(4, "Buris", "Blue" ));
                catRepository.save(new Cat(5, "Zinka", "Green"));
                catRepository.save(new Cat(6, "Marfield", "Orange"));
            }
        };
    }
}
