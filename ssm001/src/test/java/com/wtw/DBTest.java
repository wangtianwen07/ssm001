/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wtw.dao.VolumeMapper;
import com.wtw.pojo.Volume;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class DBTest {

	private ApplicationContext applicationContext = null;
	private Object obj = null;
	@Before
	public void before() {
		System.out.println("before...");
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(applicationContext);
	}
	
	@Test
	public void test() {
		obj = applicationContext.getBean("dataSource");
		System.out.println(obj);		
	}
	
	@Test 
	public void testMybatis() {
		VolumeMapper volumeMapper = (VolumeMapper) applicationContext.getBean("volumeMapper");
		System.out.println(volumeMapper);
		Volume volume = volumeMapper.findVolumeById("8a4082025e6578f5015e65834c800004");
		System.out.println(volume);
	}
}
