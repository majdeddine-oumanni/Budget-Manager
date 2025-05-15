package com.budgetmanager.backend;

import com.budgetmanager.backend.Repositories.CategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.support.Repositories;


@SpringBootApplication
@EntityScan("com.budgetmanager.backend.Entities")
@EnableJpaRepositories(basePackages = "com.budgetmanager.backend.Repositories")
public class BackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackEndApplication.class, args);
    }


     private CategoryRepository categoryRepository;
    private Repositories repositories;

}
