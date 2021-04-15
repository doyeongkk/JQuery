package kr.or.ddit.lprod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.dao.ILprodDao;
import kr.or.ddit.lprod.dao.LprodDaoImpl;
import kr.or.ddit.lprod.vo.LprodVO;

public class LprodServiceImpl implements ILprodSerivce{
	private ILprodDao dao;
	private static ILprodSerivce service;
	
	
	private LprodServiceImpl () {
		dao = LprodDaoImpl.getDao();
	}
	
	public static ILprodSerivce getService() {
		if(service == null) service =new LprodServiceImpl();
		return service;
	}
	@Override
	public List<LprodVO> getLprodlist() {
		List<LprodVO> list = null;
		try {
			list = dao.getLprodlist();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	
}

