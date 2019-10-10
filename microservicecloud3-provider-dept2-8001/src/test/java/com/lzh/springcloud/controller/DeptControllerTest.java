/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT China Mobile (SuZhou) Software Technology Co.,Ltd. 2019
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.lzh.springcloud.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.lzh.springcloud.service.impl.DeptServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DeptControllerTest {

	@Autowired
	private MockMvc mvc;

	@Mock
	private DeptServiceImpl deptServiceImpl;

	@InjectMocks
	private DeptController deptController;

	@Before
	public void setup() {
		// 初始化
		MockitoAnnotations.initMocks(this);
		// 构建mvc环境
		mvc = MockMvcBuilders.standaloneSetup(deptController).build();
	}

	@Test
	public void testDelete() {
		// mock方法行为
		// Mockito.when(deptServiceImpl.delete(1l)).thenReturn();
	}

	@Test
	public void testList() throws Exception {
		mvc.perform(MockMvcRequestBuilders.get("/dept/list")).andExpect(
				MockMvcResultMatchers.status().isOk());
	}

}
