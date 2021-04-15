package dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import vo.DonApplyVO;
import vo.LectureVO;
import vo.MemberVO;


public interface IMemberDao {
	
	//로그인할 때
	public MemberVO getMember(String mem_id) throws SQLException;
	
	//아이디검사
	public int idCheck(String mem_id) throws SQLException;
	
	//닉네임 검사
	public int nickCheck(String nick_name) throws SQLException;
	
	//비밀번호 검사
	public String pwCheck(String mem_id) throws SQLException;
	
	//회원가입
	public String joinMember(MemberVO vo) throws SQLException;
	
	//이메일 확인전송
	public String getUserEmail(String mem_id) throws SQLException;
	
	// 메일 인증 완료
	public int mailCheck(String mem_id) throws SQLException;
	
	//닉네임 변경
	public int nickUpdate(MemberVO vo) throws SQLException;
	
	//내강의 목록
	public List<LectureVO> getmyClassList(int mem_no) throws SQLException;
	
	public int idpwCheck(MemberVO vo) throws SQLException;
	
	//재능기부 요청안 작성
	public int insertdonapply(DonApplyVO donvo) throws SQLException;
	// 상태 확인
//	public int stateCheck(String mem_id) 
	
	// 회원 잠금 처리
	public int deletemember(int mem_no) throws SQLException;
}
