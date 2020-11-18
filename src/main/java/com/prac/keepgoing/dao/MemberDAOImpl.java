package com.prac.keepgoing.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prac.keepgoing.bean.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired // 의존관계를 자동으로 연결(Spring에서 제공) @Inject(JAVA 제공)
	private SqlSession sqlSession;
	private static final String namespace="com.prac.keepgoing.memberMapper";
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert((namespace)+".insertMember",vo);
	}

	@Override
	public MemberVO selectMember() throws Exception {
		sqlSession.selectOne((namespace), ".selectMember");
		return null;
		
	}

}
