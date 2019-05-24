package com.hodge.derek.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hodge.derek.aopdemo.dao.AccountDAO;
import com.hodge.derek.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		Account a = new Account();
		theAccountDAO.addAccount(a);
		
		MembershipDAO mDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		mDAO.addAccount();
		
		context.close();
	}

}
