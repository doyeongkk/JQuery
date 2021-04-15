package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.ibatis.config.SqlMapClientFactory;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdDaoImpl implements IProdDao{
	private SqlMapClient smc;
	private static IProdDao dao;
	
	private ProdDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	
	public static IProdDao getDao() {
		if(dao == null) dao = new ProdDaoImpl();
		return dao;
	}
	@Override
	public List<ProdVO> getName(String nm) throws SQLException {
		return smc.queryForList("lprod.getName", nm);
	}

	@Override
	public ProdVO getDetail(String name) throws SQLException {
		return (ProdVO) smc.queryForObject("lprod.getDetail", name);
	}

}
