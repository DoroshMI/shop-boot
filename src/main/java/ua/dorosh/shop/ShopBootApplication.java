package ua.dorosh.shop;

//import com.sun.faces.config.ConfigureListener;
import org.ocpsoft.rewrite.servlet.RewriteFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;
import org.springframework.web.context.request.RequestContextListener;


import javax.servlet.DispatcherType;
import java.util.EnumSet;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"ua.dorosh.shop"})
public class ShopBootApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ShopBootApplication.class, args);
	}


}
