package com.lzh.springcloud.controller;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lzh.springcloud.entities.Dept;
import com.lzh.springcloud.service.DeptService;

//import com.netflix.discovery.DiscoveryClient;

//@Api("Dept")
@RestController
public class DeptController {

	@Autowired
	private DeptService service;
	@Autowired
	private DiscoveryClient client;

	@ApiOperation(value = "添加成员", notes = "添加成员")
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}

	@ApiOperation(value = "根据id获取用户信息", notes = "根据id获取用户信息")
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息")
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}

	@ApiOperation(value = "根据id删除用户信息", notes = "根据id删除用户信息")
	@RequestMapping(value = "/dept/delete/{id}", method = RequestMethod.POST)
	public String delete(@PathVariable("id") Long id) {
		service.delete(id);
		return "OK";
	}

	@ApiOperation(value = "xxx", notes = "xxx")
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = client
				.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t"
					+ element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.client;
	}

}
