/**
 * No License required: You are free to use this code as you wish
 */
package me.samarthya;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;


/**
 * Main class that is the starting point for the bootstrap application. For more information you can refer to {SpringBootApplication}
 */
@SpringBootApplication
public class StartPoint {

    /**
     * Hooks the main application
     * @param args All the arguments that are passed from command line.
     */
    public static void main(String[] args) {
        SpringApplication.run(StartPoint.class, args);
    }

    /**
     * Factory method that returns CommandLineRunner
     * @param ctx ApplicationContext {ApplicationContext}
     * @return {CommandLineRunner}
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }

}
