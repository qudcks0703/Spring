package member.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MemDAOimpl implements MemberDAO {

	private SqlSessionTemplate sqlSession=null;

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sqlSession.insert("member.signup", vo);
	}
 
	@Override
	public int loginMember(MemberVO vo) throws Exception {
		
		return sqlSession.selectOne("member.login", vo);
	}

	@Override
	public MemberVO modifyMember(String id) throws Exception {
		
		return sqlSession.selectOne("member.modify",id);
	}

	@Override
	public void modifyProMember(MemberVO vo) throws Exception {
		sqlSession.update("member.modifypro", vo);
	}

	@Override
	public List selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO selectMember(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMember(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int idAvailCheck(String id) throws Exception {
		
		return sqlSession.selectOne("member.idavail",id);
	}


}
