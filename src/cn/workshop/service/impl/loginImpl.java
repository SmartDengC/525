package cn.workshop.service.impl;

import cn.workshop.service.loginControl;

public class loginImpl implements loginControl {

	@Override
	public boolean logindeal(String name, String password) {
		// TODO Auto-generated method stub
		if(name.equals("admin") && password.equals("123456"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
