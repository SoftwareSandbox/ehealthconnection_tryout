package be.swsb.ehealthconnectiontryout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "be")
public class EhealthApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(EhealthApplication.class);
    }

    public static void main(final String[] args) {
        SpringApplication.run(EhealthApplication.class, args);
    }
}