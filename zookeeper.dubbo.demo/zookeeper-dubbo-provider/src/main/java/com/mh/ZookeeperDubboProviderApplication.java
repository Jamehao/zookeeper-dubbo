package com.mh;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ZookeeperDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZookeeperDubboProviderApplication.class, args);
	}

}
