package com.oaec.dvd.bizImpl;

import java.util.ArrayList;
import java.util.Scanner;
import com.oaec.dvd.biz.IUserBiz;
import com.oaec.dvd.model.User;


public class IUserBizImpl implements IUserBiz{
	
	final int MAXNUM = 1000; 
	ArrayList<User> list = new ArrayList();
	Scanner input = new Scanner(System.in);
	int a = 0;
	
	@Override
	public void register() {
		if(a < 100000){
			System.out.println("��ӭע�ᣡ");
			User user = new User();
			System.out.println("�������û�����");
			String userName = input.next();		
			String name = userNameCheck(userName);			
			user.setUname(userName);
			while(checkUserName(list,userName) != null){
				System.out.println("���û��Ѵ��ڣ������������û���");
				userName = input.next();
			}		
			System.out.println("���������룺");
			String password = input.next();
			passwordCheck(password);
			user.setUname(password);
			list.add(new User(a,userName,password,0));	
			System.out.println("ע��ɹ���");
		}else{
			System.out.println("ע���û����Ѵﵽ����");
		}
	}
	
	@Override
	public void login() {
		System.out.println("��ӭ��¼DVD����ϵͳ��");
		Scanner input = new Scanner(System.in);
		System.out.println("�������û�����");
		String userName = input.next();
		userNameCheck(userName);
		User user = checkUserName(list,userName);
		if(user != null){
			System.out.println("���������룺");
			String password = input.next();
			if(notEmptyCheck(password)){
				checkPassword(user,password);
			}		
		}else{
			System.out.println("���û������ڣ�����������:");
			userName = input.next();
		}
	}	

	public User checkUserName(ArrayList<User> list,String name){
		User u = null;
		if(list.get(0) == null){
			return u;
		}else{
			for (int i = 0; i <= a; i++) {
				if(name.equals(list.get(i).getUname())){
					u =  list.get(i);
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
			System.out.println("�û�������Ϊ�գ������������û�����");
			userName = input.next();
		}
		return userName;
	}
	
	public void passwordCheck(String password){
		while(!notEmptyCheck(password)){
			System.out.println("���벻��Ϊ�գ������������û�����");
			password = input.next();
		}
	}
	
	public void checkPassword(User u, String password){
		for (int j = 0; j < 3; j++) {
			if(!password.equals(u.getUpass())){
				if(j == 2){
					System.out.println("�����Ѿ��������3�Σ�����������");
				}else{
					System.out.println("�����������������");
				}
			}else{
				System.out.println("��¼�ɹ�");
				break;
			}
		}	
	}
	
	@Override
	public void lend() {
		// TODO Auto-generated method stub
		
	}
}
