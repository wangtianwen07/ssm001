/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017��8��21�� ����10:01:17] by wangtianwen
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
	 * �ʾ��б�
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView listVolume() {
		ModelAndView modelAndView = new ModelAndView("volume/list");
		List<Volume> volumeList = new ArrayList<Volume>();
		Volume volume1 = new Volume();
		volume1.setUuid("123");
		volume1.setName("qq��");
		Volume volume2 = new Volume();
		volume2.setUuid("456");
		volume2.setName("pp��");
		volumeList.add(volume1);
		volumeList.add(volume2);
		modelAndView.addObject("list", volumeList);
		return modelAndView;
	}
	
	/**
	 * �ʾ���������
	 * ����json����ͨ��produces="application/json;charset=utf-8"���response��������
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
		return "�����ʾ�ɹ���";
	}
	
	//�磺restful���http://localhost:8899/ssm001/volumes/8a4082025e6578f5015e65834c800004
	/**
	 * �鿴�ʾ�
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
	 * ��ת���༭�ʾ�ҳ��
	 * @param volumeId
	 * @return
	 */
	@RequestMapping(path="/{volumeId}/edit",method=RequestMethod.GET)
	public ModelAndView toEditVolume(@PathVariable String volumeId) {
		Volume volume = new Volume();
		volume.setUuid(volumeId);
		volume.setName("ԭ�ʾ�����");
		ModelAndView modelAndView = new ModelAndView("volume/edit");
		modelAndView.addObject("volume",volume);
		return modelAndView; 
	}
	
	/**
	 * �����ʾ���ת���ʾ��б�ҳ��
	 */
	@RequestMapping(method=RequestMethod.PUT)
	public String editVolume(Volume volume) {
		System.out.println("�����ʾ�"+volume.getName()+"�ɹ���");
		return "redirect:/volume/";
	}
	/**
	 * �ʾ�ɾ��
	 * @param volumeId
	 * @return
	 */
	@ResponseBody
	@RequestMapping(path="/{volumeId}",method=RequestMethod.DELETE,produces="application/json;charset=utf-8")
	public String deleteVolume(@PathVariable String volumeId) {
		System.out.println("ɾ���ʾ�"+volumeId);
		return "success";
	}
	
	/**
     * ��ת������ʾ�ҳ�棬Լ���������ã�Ĭ��ƥ���ļ�/WEB-INF/JSP/volume/add.jsp
     */
	@RequestMapping("add")
	public void add() {}
	
}
