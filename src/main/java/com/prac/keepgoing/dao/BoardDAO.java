package com.prac.keepgoing.dao;

import java.util.List;

import com.prac.keepgoing.bean.BoardVO;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	public List<BoardVO> listAll() throws Exception;
	public BoardVO read(Integer no) throws Exception;
	public void delete(Integer no) throws Exception;
	public void update(BoardVO vo) throws Exception;
}
