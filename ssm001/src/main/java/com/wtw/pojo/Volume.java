/**
 * Copyrigth(c) Css Team
 * All rights reserved
 *
 * This file AddOrUpdProjectPerformBlackList.java creation date:[2017年8月21日 上午10:01:17] by wangtianwen
 * http://www.css.com.cn
 */
package com.wtw.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author wangtianwen
 * @version 1.0
 */
public class Volume implements Serializable{
	private static final long serialVersionUID = 1L;
	private String uuid;
	private String type;
	private String sysid;
	private String name;
	private String description;
	private Date startTime;
	private Date endTime;
	private String tksMessage;
	private String status;
	private Date createTime;
	private String scope;
	private String url;
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSysid() {
		return sysid;
	}
	public void setSysid(String sysid) {
		this.sysid = sysid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public String getTksMessage() {
		return tksMessage;
	}
	public void setTksMessage(String tksMessage) {
		this.tksMessage = tksMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Volume [uuid=" + uuid + ", type=" + type + ", sysid=" + sysid + ", name=" + name + ", description="
				+ description + ", startTime=" + startTime + ", endTime=" + endTime + ", tksMessage=" + tksMessage
				+ ", status=" + status + ", createTime=" + createTime + ", scope=" + scope + ", url=" + url + "]";
	}
}
