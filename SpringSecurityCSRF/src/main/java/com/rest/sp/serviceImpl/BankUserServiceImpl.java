package com.rest.sp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rest.sp.model.BankUser;
import com.rest.sp.repo.BankUserRepository;
import com.rest.sp.service.IBankUserService;

public class BankUserServiceImpl  implements IBankUserService{
	
	@Autowired
	private BankUserRepository bankUserRepository;

	@Override
	public Integer saveBankUser(BankUser bankUser) {
		Integer id=bankUserRepository.save(bankUser).getBankId();
		return id;
	}

}
