package com.lzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
// 服务发现
@EnableSwagger2
public class DeptProvider8001_APP {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001_APP.class, args);
	}

}
