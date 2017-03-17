package com.oaec.dvd.test;

import com.oaec.dvd.bizImpl.IUserBizImpl;
import com.oaec.dvd.model.User;

public class Test {
	public static void main(String[] args) {
		IUserBizImpl Iuser = new IUserBizImpl();
		Iuser.register();
	}
}
