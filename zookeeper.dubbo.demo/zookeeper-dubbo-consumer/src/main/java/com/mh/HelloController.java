package com.mh;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mh.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *@author  Created by Toby on 2019/4/1.
 */
@Controller
@RequestMapping("/cnmd")
public class HelloController {
	
	@Reference
	private HelloService helloService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		String hello = helloService.sayHello("world");
		System.out.println(helloService.sayHello("抵制996!!!!"));
		return hello;
	}
}
