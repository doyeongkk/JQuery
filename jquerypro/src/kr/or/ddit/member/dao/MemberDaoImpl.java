package kr.or.ddit.member.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.member.vo.ZipVO;
/*
 * SqlMapClient 객체 얻어 오기 
 * 자신의 daoImpl객체 생성 하고 리턴하는 메서드  - service에서 사용하기 위함 
 */
public class MemberDaoImpl implements IMemberDao{
	
	private SqlMapClient smc;
	private static IMemberDao dao;
	
	private MemberDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	
	
	
	
	
	
	
	
	public static IMemberDao getDao() {
		if(dao == null) dao = new MemberDaoImpl();
		
		return dao;
	}

	@Override
	public List<MemberVO> getAllMember() throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("mymember.getAllMember");
	}



	@Override
	public String selectById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return (String)smc.queryForObject("mymember.selectById", id);
	}



	@Override
	public List<ZipVO> selectByDong(String dong) throws SQLException {
		// TODO Auto-generated method stub
		return smc.queryForList("mymember.selectByDong", dong);
	}









	@Override
	public String insertMember(MemberVO vo) throws SQLException {
		// TODO Auto-generated method stub
		
		return (String)smc.insert("mymember.insertMember", vo);
		
	}

}
