package kr.or.ddit.prod.service;

import java.util.List;

import kr.or.ddit.prod.vo.ProdVO;

public interface IProdService {
	// prod 가져오기
	public List<ProdVO> getName(String nm);
	
	// prod 디테일 가져오기
	public ProdVO getDetail(String name);
}
