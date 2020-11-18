package com.prac.keepgoing.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.prac.keepgoing.bean.TestBean;

@Repository /*DAO를 Spring에 인식시킴*/
public class TestDAOImpl implements TestDAO {
	//사용할 *Mapper.xml의 namespace명
	private static final String namespace = "com.prac.keepgoing.DBMapper";
	
	@Inject	//DB커넥션과 close()를 자동으로 호출해주는 SqlSession
	private SqlSession sqlSession;
	
	@Override
	public List<TestBean> test() throws Exception {
		// TODO Auto-generated method stub		//Mapper Query의 id
		return sqlSession.selectList(namespace + ".test");
	}

}
