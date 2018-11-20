package com.spring.springboot;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 
import com.spring.springboot.dubbo.CityDubboConsumerService;
 
/**
 * Spring Boot 应用启动类
 *
 * Created by tz on 01/04/2017.
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class ClientApplication {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        ConfigurableApplicationContext run = SpringApplication.run(ClientApplication.class, args);
        CityDubboConsumerService cityService = run.getBean(CityDubboConsumerService.class);
        cityService.printCity();
	}
 
}
