package com.lzh.springcloud.service;

import java.util.List;

import com.lzh.springcloud.entities.Dept;

public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();

	public void delete(Long id);

}
