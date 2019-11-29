package com.honghu.cloud.modules.house.vo;

import java.io.Serializable;
import java.util.Date;


/**
 * 录入数据
 * 
 * @author honghu cloud
 * @technology +QQ： 2170983087
 * @date 2017-03-23 15:22:06
 */
public class InputDataRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	//代理人
	private String proxyName;
	//客户姓名
	private String customerName;
	//手机号
	private String customerMobile;
	//备注
	private String remark;

	public String getProxyName() {
		return proxyName;
	}

	public void setProxyName(String proxyName) {
		this.proxyName = proxyName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
