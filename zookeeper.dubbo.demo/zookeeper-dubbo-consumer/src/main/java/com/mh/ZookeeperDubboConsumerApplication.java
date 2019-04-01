package com.mh;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com"})
@SpringBootApplication
@EnableDubboConfiguration
public class ZookeeperDubboConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperDubboConsumerApplication.class, args);
	}

}
