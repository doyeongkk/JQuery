package kr.or.ddit.buyer.service;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.buyer.dao.BuyerDaoImpl;
import kr.or.ddit.buyer.dao.IBuyerDao;
import kr.or.ddit.buyer.vo.BuyerVO;

public class BuyerServiceImpl implements iBuyerService {
	private IBuyerDao dao;
	private static iBuyerService service;

	private BuyerServiceImpl() {
		dao = BuyerDaoImpl.getDao();
	}
	
	public static iBuyerService getservice() {
		if(service ==null) service = new BuyerServiceImpl();
		
		return service;
	}
	

	@Override
	public List<BuyerVO> getBuyerNames() {
		List<BuyerVO> list = null;
	try {
		list = dao.getBuyerNames();
	} catch (SQLException e) {
	e.printStackTrace();
	}
		
		return list;
	}

	@Override
	public BuyerVO getDetail(String id) {
	BuyerVO vo = null;
	
	try {
		vo = dao.getDetail(id);
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return vo;
	}
      
}
