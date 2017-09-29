/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wtw.pojo.Volume;
import com.wtw.service.IVolumeService;


/**
 * @author wangtianwen
 * @version 1.0
 */
@Controller
@RequestMapping("/volume")
public class VolumeController {

	@Autowired
	private IVolumeService volumeService;
	
	/**
	 * 问卷列表
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listVolume() {
		ModelAndView modelAndView = new ModelAndView("volume/list");
		List<Volume> volumeList = new ArrayList<Volume>();
		Volume volume1 = new Volume();
		volume1.setUuid("123");
		volume1.setName("qq市");
		Volume volume2 = new Volume();
		volume2.setUuid("456");
		volume2.setName("pp地");
		volumeList.add(volume1);
		volumeList.add(volume2);
		modelAndView.addObject("list", volumeList);
		return modelAndView;
	}
	
	/**
	 * 问卷新增保存
	 * 返回json，并通过produces="application/json;charset=utf-8"解决response中文乱码
	 * @param volume
	 * @return
	 */
	@ResponseBody
	@RequestMapping(method=RequestMethod.POST,produces="application/json;charset=utf-8")
	public String addVolume(Volume volume) {
		String uuid = volume.getUuid();
		String name = volume.getName();
		System.out.println(uuid+" "+name);
		System.out.println(volume.toString());
		return "新增问卷成功！";
	}
	
	//如：restful风格：http://localhost:8899/ssm001/volumes/8a4082025e6578f5015e65834c800004
	/**
	 * 查看问卷
	 * @param volumeId
	 * @return
	 */
	@RequestMapping(path="/{volumeId}",method=RequestMethod.GET)
	public ModelAndView viewVolume(@PathVariable String volumeId) {
		ModelAndView modelAndView = new ModelAndView("volume/view");
		Volume volume = volumeService.findVolumeById(volumeId);
		modelAndView.addObject("volume", volume);
		return modelAndView;
	}
	
	/**
	 * 跳转到编辑问卷页面
	 * @param volumeId
	 * @return
	 */
	@RequestMapping(path="/{volumeId}/edit",method=RequestMethod.GET)
	public ModelAndView toEditVolume(@PathVariable String volumeId) {
		Volume volume = new Volume();
		volume.setUuid(volumeId);
		volume.setName("原问卷名称");
		ModelAndView modelAndView = new ModelAndView("volume/edit");
		modelAndView.addObject("volume",volume);
		return modelAndView; 
	}
	
	/**
	 * 更新问卷并跳转到问卷列表页面
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public String editVolume(Volume volume) {
		System.out.println("更新问卷"+volume.getName()+"成功！");
		return "redirect:/volume/";
	}
	/**
	 * 问卷删除
	 * @param volumeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(path="/{volumeId}",method=RequestMethod.DELETE,produces="application/json;charset=utf-8")
	public String deleteVolume(@PathVariable String volumeId) {
		System.out.println("删除问卷："+volumeId);
		return "success";
	}
	
	/**
     * 跳转到添加问卷页面，约定优于配置，默认匹配文件/WEB-INF/JSP/volume/add.jsp
     */
	@RequestMapping("add")
	public void add() {}
	
}
