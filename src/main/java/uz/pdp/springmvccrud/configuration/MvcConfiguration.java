package uz.pdp.springmvccrud.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import uz.pdp.springmvccrud.dao.UserDao;
import uz.pdp.springmvccrud.dao.UserDaoImpl;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "uz.pdp")
@EnableWebMvc
public class MvcConfiguration implements WebMvcConfigurer {

    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");

    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/users");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root123");

        return dataSource;
    }

    @Bean
    public UserDao getUserDao(){
        return new UserDaoImpl(getDataSource());
    }
}
