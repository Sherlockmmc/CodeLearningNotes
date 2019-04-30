package test;

import org.junit.Test;
import com.cy.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

public class helloSpring {
    @Test
    public void  Test1(){
        User u=new  User();
        u.setU_id(1);
        System.out.println(u);

    }

    //IOC:Inversion of Control
    //IOC的反转：创建对象这份工作由我们自己执行反转给spring帮我们执行;
    //IOC的控制：就是由spring帮我们负责创建销毁对象，
    // 掌控对象的生命周期等，我们在需要的时候，向Spring申请
    //IOC是一种编程思想，也是一种新的设计模式,它需要（依赖注入DI）技术的支撑;
    //spring是一个容器，他将帮我们管理对象
    //DI(Dependency Injection):依赖注入：将值通过配置的方式为变量初始化/赋值（注入）

    @Test
    public void  Test2(){
        //根据spring配置文件获取容器对象
        //ApplicationContext 配置的所有bean都会在容器创建的时候被创建出来
        //如果配置的bean较多，那么在创建容器的时候，会产生内存过大的问题，
        //这种情况在机器性能较为落后的时候体现较为明显
        //spring通过延迟加载处理问题 lazy-init="true"; true就是创建容器是不加载bean对象，在获取的时候才创建；

        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        //通过getBaan获取配置好的user对象(程序员向springz容器要对象)

        User u=(User)ac.getBean("user");
        System.out.println(u);
    }
}
