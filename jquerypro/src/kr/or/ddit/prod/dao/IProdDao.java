package kr.or.ddit.prod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdDao {
	// prodname 가져오기
	public List<ProdVO> getName(String nm) throws SQLException;
	
	// prod 디테일 가져오기
	public ProdVO getDetail(String name) throws SQLException;
}
