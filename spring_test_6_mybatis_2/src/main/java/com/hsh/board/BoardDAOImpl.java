package com.hsh.board;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;
	private static final String nameSpace = "BoardMapper";
	
	@Override
	public BoardDTO view(int num) throws Exception {
		BoardDTO bdDto = sqlSession.selectOne(nameSpace+".view", num);
		return bdDto;
	}

}
