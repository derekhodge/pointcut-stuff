package com.hodge.derek.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.hodge.derek.aopdemo.Account;

@Component
public class AccountDAO {

	public void addAccount(Account theAccount) {
		System.out.println(getClass() + "doing work. adding account");
	}

}
