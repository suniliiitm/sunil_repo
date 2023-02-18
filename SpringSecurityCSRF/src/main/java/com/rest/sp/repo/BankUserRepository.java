package com.rest.sp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.sp.model.BankUser;

public interface BankUserRepository extends JpaRepository<BankUser, Integer>{}
