package board.model.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class BoardDAOimpl implements BoardDAO {

	private SqlSessionTemplate sqlSession=null;

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void insertArticle(BoardVO vo) throws Exception {
		sqlSession.insert("board.write", vo);
	}

	@Override
	public int getArticleCount() throws Exception {
		
		return sqlSession.selectOne("board.getArticleCount");
	}

	@Override
	public List getArticles(int start, int end) throws Exception {
		HashMap hm=new HashMap();
		hm.put("start", start);
		hm.put("end", end);
		
		return sqlSession.selectList("board.getArticles", hm);
	}

	@Override
	public BoardVO getArticle(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getArticleForUpdate(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateArticle(BoardVO vo) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteArticle(int num, String passwd) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



}
