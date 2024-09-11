package com.edu.tdm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Step 1: Load the Spring application context
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Step 6: Retrieve the bean and use it
        MessageService messageService = context.getBean(MessageService.class);
        messageService.setMessage("Hello, Spring Bean Lifecycle!");
        messageService.printMessage();

        // Step 8: Close the application context (triggers bean destruction)
        ((AnnotationConfigApplicationContext) context).close();

    }
}

/**
 * Explanation of Bean Lifecycle Callbacks
 * Constructor: The bean is instantiated when Spring creates the bean instance.
 * BeanNameAware and BeanFactoryAware: These interfaces provide the bean with its name and the BeanFactory.
 * @PostConstruct: A custom initialization method is invoked immediately after the bean is fully initialized.
 * InitializingBean.afterPropertiesSet(): This method is called right after all the properties are set.
 * Bean in Use: At this point, the bean is ready for use by the application.
 * @PreDestroy and DisposableBean.destroy(): These are called when the Spring container is shutting down, allowing for any cleanup work.
 */