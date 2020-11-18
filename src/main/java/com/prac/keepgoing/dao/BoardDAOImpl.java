package com.prac.keepgoing.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prac.keepgoing.bean.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSession sqlSession;
	private static String namespace = "com.prac.keepgoing.boardMapper";
	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert((namespace)+".insertBoard",vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		List<BoardVO> vo = sqlSession.selectList(namespace+".listBoard");
		return vo;
	}

	@Override
	public BoardVO read(Integer no) throws Exception {
		BoardVO vo = sqlSession.selectOne(namespace+".detailBoard", no);
		return vo;
	}

	@Override
	public void delete(Integer no) throws Exception {
		sqlSession.delete(namespace+".deleteBoard", no);
	}

	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace+".updateBoard", vo);
	}
	
}
