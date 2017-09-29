/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017骞�8鏈�21鏃� 涓婂崍10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wtw.pojo.Volume;
import com.wtw.service.IVolumeService;

/**
 * @author wangtianwen
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class springMybatisTest {

	//按名称注入
	@Resource
	private IVolumeService volumeService;
	
	@Test
	public void testVolume() {
		Volume volume = volumeService.findVolumeById("8a4082025e6578f5015e65834c800004");
		System.out.println(volume.toString());
	}
}
