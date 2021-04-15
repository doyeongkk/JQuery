package kr.or.ddit.prod.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.dao.IProdDao;
import kr.or.ddit.prod.dao.ProdDaoImpl;
import kr.or.ddit.prod.vo.ProdVO;

public class ProdServiceImpl implements IProdService{
	private IProdDao dao;
	private static IProdService service;
	
	private ProdServiceImpl() {
		dao = ProdDaoImpl.getDao();
	}
	
	public static IProdService getService() {
		if(service == null) service = new ProdServiceImpl();
		return service;
	}
	
	@Override
	public List<ProdVO> getName(String nm) {
		List<ProdVO> list = null;
		try {
			list = dao.getName(nm);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ProdVO getDetail(String name) {
		ProdVO vo = null;
		try {
			vo = dao.getDetail(name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;
	}

}
