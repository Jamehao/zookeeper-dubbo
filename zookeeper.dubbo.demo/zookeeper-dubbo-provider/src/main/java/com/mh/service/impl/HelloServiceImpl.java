package com.mh.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mh.service.HelloService;
import org.springframework.stereotype.Component;

/**
 *@author  Created by Toby on 2019/4/1.
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
