package kr.or.ddit.buyer.service;

import java.util.List;

import kr.or.ddit.buyer.vo.BuyerVO;

public interface iBuyerService {
  // 전체 이름과 id 가져오기 
	public List<BuyerVO> getBuyerNames();
	
	//id를 조건으로 조회하기 
	public BuyerVO getDetail(String id);
}
