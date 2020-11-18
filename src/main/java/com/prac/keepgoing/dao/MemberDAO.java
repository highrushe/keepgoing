package com.prac.keepgoing.dao;

import com.prac.keepgoing.bean.MemberVO;

public interface MemberDAO {
	public void insertMember(MemberVO vo) throws Exception;
	public MemberVO selectMember() throws Exception;
}
