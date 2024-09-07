package lk.ijse;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
//        System.out.println("Hello World!");


        //create the application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        //get bean can use for get the object from application context
        AppConfig bean = ctx.getBean(AppConfig.class);
        System.out.println(bean);

        //check the bean component in application context
        SpringBean bean1 = ctx.getBean(SpringBean.class);
        System.out.println(bean1);
    }
}
