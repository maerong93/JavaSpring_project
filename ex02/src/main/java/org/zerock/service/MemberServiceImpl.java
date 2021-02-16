package org.zerock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void join(MemberVO vo) {
		
		mapper.join(vo);
		
	}

	@Override
	public MemberVO login(MemberVO vo) {
		
		return mapper.login(vo);
	}
	

}
