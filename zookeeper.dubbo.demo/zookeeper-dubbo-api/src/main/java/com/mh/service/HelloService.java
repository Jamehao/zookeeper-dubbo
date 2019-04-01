package com.mh.service;

/**
 *@author  Created by Toby on 2019/4/1.
 */
public interface HelloService {
	
	/**
	 * 暴露接口
	 * @param name name
	 * @return "Hello " + name
	 */
	String sayHello(String name);
}
