package com.internousdev.webproj2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.webproj2.dao.HelloStrutsDAO;
import com.opensymphony.xwork2.ActionSupport;

public class HelloStrutsAction extends ActionSupport implements SessionAware{

	private Map<String,Object> session;

	public String execute() {
		String ret = ERROR;
		HelloStrutsDAO dao = new HelloStrutsDAO();
		boolean b = dao.select();
		if (b == true) {
			ret = SUCCESS;
		} else {
			ret = ERROR;
		}
		return ret;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
