package com.prac.keepgoing.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.prac.keepgoing.bean.TestBean;
import com.prac.keepgoing.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService {
	
	@Inject
	private TestDAO dao;
	
	@Override
	public List<TestBean> test() throws Exception {
		return dao.test();
	}

}
