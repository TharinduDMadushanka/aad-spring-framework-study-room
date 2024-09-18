package com.edu.tdm;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }
}

/**
 * Purpose: This class is a Servlet initializer, specifically for registering and configuring the DispatcherServlet in a
   Spring MVC application without needing a web.xml file. This is known as Java-based configuration.

 * Details:

 * getRootConfigClasses(): This method defines configuration classes for the root application context.
 * In your case, it points to WebRootConfig (which would typically hold non-web-related beans like services, repositories, etc.).

 * getServletConfigClasses(): Defines the configuration classes for the web application context, in this case, WebAppConfig.

 * getServletMappings(): Specifies the URL mappings for the DispatcherServlet. You have configured it to map to "/*",
  meaning it will handle all incoming requests for your application.
 */