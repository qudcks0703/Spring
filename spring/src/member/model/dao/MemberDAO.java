package member.model.dao;

public interface MemberDAO {

	public void insertMember(MemberVO vo) throws Exception;
	public int loginMember(MemberVO vo) throws Exception;
	public MemberVO modifyMember(String id) throws Exception;
	public void modifyProMember(MemberVO vo) throws Exception;
} 
