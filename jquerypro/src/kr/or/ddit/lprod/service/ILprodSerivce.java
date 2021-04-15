package kr.or.ddit.lprod.service;

import java.util.List;

import kr.or.ddit.lprod.vo.LprodVO;

public interface ILprodSerivce {

	//전체 이름 조회하기
	public List<LprodVO> getLprodlist();
}
