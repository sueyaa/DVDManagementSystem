package com.oaec.dvd.bizImpl;

import java.util.Scanner;
import com.oaec.dvd.biz.IUserBiz;
import com.oaec.dvd.model.User;


public class IUserBizImpl implements IUserBiz{
	
	final int MAXNUM = 1000; 
	User[] userArr = new User[1000];
	int a = 0;
	Scanner input = new Scanner(System.in);

	@Override
	public void register() {
		if(a < 1000){
			System.out.println("欢迎注册！");
			User user = new User();
			System.out.println("请输入用户名：");
			String userName = input.next();		
			String name = userNameCheck(userName);			
			user.setUname(userName);
			while(checkUserName(userArr,userName) != null){
				System.out.println("该用户已存在，请重新输入用户名");
				userName = input.next();
			}		
			System.out.println("请输入密码：");
			String password = input.next();
			passwordCheck(password);
			user.setUname(password);
			userArr[a++] = new User(a,userName,password,0);	
			System.out.println("注册成功！");
		}else{
			System.out.println("注册用户数已达到上限");
		}
	}
	
	@Override
	public void login() {
		System.out.println("欢迎登录DVD租赁系统！");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName = input.next();
		userNameCheck(userName);
		User user = checkUserName(userArr,userName);
		if(user != null){
			System.out.println("请输入密码：");
			String password = input.next();
			if(notEmptyCheck(password)){
				checkPassword(user,password);
			}		
		}else{
			System.out.println("该用户不存在，请重新输入:");
			userName = input.next();
		}
	}	

	public User checkUserName(User[] user,String name){
		User u = null;
		if(user[0] == null){
			return u;
		}else{
			for (int i = 0; i <= a; i++) {
				if(name.equals(user[i].getUname())){
					u =  user[i];
				}
			}
		}	
		return u;	
	}
	
	

	public boolean notEmptyCheck(String str){
		if(str == null || str.equals("")){
			return false;
		}else{
			return true;
		}
	}
	
	public String userNameCheck(String userName){
		while(!notEmptyCheck(userName)){
			System.out.println("用户名不能为空，请重新输入用户名：");
			userName = input.next();
		}
		return userName;
	}
	
	public void passwordCheck(String password){
		while(!notEmptyCheck(password)){
			System.out.println("密码不能为空，请重新输入用户名：");
			password = input.next();
		}
	}
	
	public void checkPassword(User u, String password){
		for (int j = 0; j < 3; j++) {
			if(!password.equals(u.getUpass())){
				if(j == 2){
					System.out.println("密码已经输入错误3次，请明天再试");
				}else{
					System.out.println("密码错误请重新输入");
				}
			}else{
				System.out.println("登录成功");
				break;
			}
		}	
	}
	
	@Override
	public void lend() {
		// TODO Auto-generated method stub
		
	}
}
