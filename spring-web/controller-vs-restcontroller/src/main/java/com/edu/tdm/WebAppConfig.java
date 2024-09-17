package com.edu.tdm;

import com.edu.tdm.api.MyController1;
import com.edu.tdm.api.MyController2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {

    public WebAppConfig() {
        System.out.println("WebAppConfig Instantiated -constructor()");
    }

    /**
     * The addResourceHandlers method maps URL paths to physical locations for static resources.
     * Here, it maps /WEB-INF/WEB-INF/pages/** to the same location.
     */
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/WEB-INF/pages/**").addResourceLocations("/WEB-INF/WEB-INF/pages/");
    }

    /**
     * InternalResourceViewResolver: Configures how view names are resolved. Here,
     * it looks for views under /WEB-INF/WEB-INF/pages/ with the .html extension.
     */
    @Bean
    public ViewResolver viewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/WEB-INF/pages/",".html");
    }

    @Bean
    public MyController1 myController1() {
        return new MyController1();
    }

    @Bean
    public MyController2 myController2() {
        return new MyController2();
    }
}
/**
 * @Configuration: Indicates that this class contains Spring configuration.
 * @EnableWebMvc: Enables Spring MVC in the application, including features like annotation-driven controllers and view resolution.
 */

/**
 * Explanation of ViewResolver Usage:
 *
 * @Controller expects to return a view name. The view resolver (InternalResourceViewResolver)
 * resolves this view name to an actual view (e.g., /WEB-INF/WEB-INF/pages/simple.html).

 * In the case of MyController2, the method returns "hello controller2".
 * The view resolver will try to find a view file at /WEB-INF/WEB-INF/pages/hello simple.html.
 * This will cause an issue because there is no space in file names.
 */