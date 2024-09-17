package com.edu.tdm;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebAppInitializer() {
        System.out.println("WebAppInitializer Instantiated -constructor()");
    }

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
        return new String[]{"/"};
    }
}
/**
 * Purpose: This class replaces the traditional web.xml file and sets up the Spring DispatcherServlet.
 * Root Config: Returns the root configuration class (WebRootConfig). It sets up the global application context.
 * Servlet Config: Returns the servlet configuration class (WebAppConfig), setting up the Spring MVC context.
 * Servlet Mapping: Maps all requests ("/") to the DispatcherServlet, making it the central entry point for the application.
 */