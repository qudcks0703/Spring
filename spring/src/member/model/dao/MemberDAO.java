package member.model.dao;

import java.util.List;

public interface MemberDAO {

	public void insertMember(MemberVO vo) throws Exception;
	public int loginMember(MemberVO vo) throws Exception;
	public MemberVO modifyMember(String id) throws Exception;
	public void modifyProMember(MemberVO vo) throws Exception;
	//전체 회원 데이터 조회
	public List selectAll() throws Exception;
	//회원 한명 데이터 조회
	public MemberVO selectMember(String id) throws Exception;
	//회원 데이터 삭제
	public void deleteMember(String id) throws Exception;
	//아이디 사용가능여부 조회
	public int idAvailCheck(String id) throws Exception;
} 
