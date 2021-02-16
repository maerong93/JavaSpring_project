package org.zerock.service;

import org.zerock.domain.MemberVO;

public interface MemberService {
	
	public void join(MemberVO vo);
	public MemberVO login(MemberVO vo); 

}
