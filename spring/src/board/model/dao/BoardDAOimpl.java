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
	public BoardVO insertArticle(BoardVO vo) throws Exception {
		int check=sqlSession.insert("board.write", vo);
		BoardVO bdto=null;
		if(check==1) {
			bdto=sqlSession.selectOne("board.getMaxArticle");
		}
		return bdto;
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
		
		return sqlSession.selectOne("board.getArticle", num);
	}

	@Override
	public BoardVO getArticleForUpdate(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateArticle(BoardVO vo) throws Exception {
		
		
		return sqlSession.update("board.update", vo);
	}

	@Override
	public int deleteArticle(int num, String passwd) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getsize() throws Exception {
		
		return sqlSession.selectOne("board.getsize");
	}



}
