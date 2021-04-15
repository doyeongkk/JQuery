package kr.or.ddit.lprod.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.ddit.lprod.vo.LprodVO;

public interface ILprodDao {

	//전체 이름 조회하기
		public List<LprodVO> getLprodlist() throws SQLException;
}
