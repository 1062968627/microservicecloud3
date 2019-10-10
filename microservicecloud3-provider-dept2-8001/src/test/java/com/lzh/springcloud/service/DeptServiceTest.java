/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT China Mobile (SuZhou) Software Technology Co.,Ltd. 2019
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.lzh.springcloud.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lzh.springcloud.entities.Dept;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeptServiceTest {

	@Autowired
	private DeptService deptService;

	@Test
	public void testGet() {
		// Dept dept = deptService.get(Long.valueOf(1));
		Dept dept = deptService.get(1l);
		Assert.assertEquals(new String("开发部"), dept.getDname());
		/*
		 * assertNotNull(dept); assertEquals(dept, dept);
		 */
		System.out.println(dept);
	}

}
