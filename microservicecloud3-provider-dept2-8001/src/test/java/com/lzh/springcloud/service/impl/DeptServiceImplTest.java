/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT China Mobile (SuZhou) Software Technology Co.,Ltd. 2019
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.lzh.springcloud.service.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lzh.springcloud.dao.DeptDao;
import com.lzh.springcloud.entities.Dept;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DeptServiceImplTest {

	@InjectMocks
	private DeptServiceImpl deptServiceImpl;

	@Mock
	private DeptDao deptDao;

	@Before
	public void setUp() throws Exception {
		// log.info("set up junit");
		MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		Dept dept = new Dept();
		dept.setDeptno(23l);
		dept.setDname("tom");
		dept.setDb_source("db_source");

		boolean except = true;
		Mockito.when(deptDao.addDept(dept)).thenReturn(except);
		boolean actual = deptServiceImpl.add(dept);
		Assert.assertEquals(except, actual);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGet() {
		Dept dept = deptServiceImpl.get(Long.valueOf(1));
		Assert.assertEquals(new String("a"), dept.getDname());
		System.out.println(dept);
	}

}
