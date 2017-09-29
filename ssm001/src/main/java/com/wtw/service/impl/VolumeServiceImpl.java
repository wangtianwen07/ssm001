/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtw.dao.VolumeMapper;
import com.wtw.pojo.Volume;
import com.wtw.service.IVolumeService;

/**
 * @author wangtianwen
 * @version 1.0
 */
@Service("volumeService")
public class VolumeServiceImpl implements IVolumeService{
	
	//按类型注入
	@Autowired
	private VolumeMapper volumeMapper;
	
	@Override
	public Volume findVolumeById(String uuid) {
		Volume volume = null;
		try {
			volume = volumeMapper.findVolumeById(uuid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return volume;
	}
}
