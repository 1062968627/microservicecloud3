/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT China Mobile (SuZhou) Software Technology Co.,Ltd. 2019
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.lzh.springcloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
// @Slf4j
// @Data
public class LoggerTest {

	private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

	@Test
	public void test1() {

		String name = "xiaoming";
		String password = "123";

		logger.debug("debug...");
		logger.info("name:" + name + " ,password:" + password);
		logger.info("name:{},password:{}", name, password);
		logger.error("error...");

	}

}
