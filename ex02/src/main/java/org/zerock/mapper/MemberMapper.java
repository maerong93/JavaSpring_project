package org.zerock.mapper;

import org.zerock.domain.MemberVO;

public interface MemberMapper {
	
	public void join(MemberVO vo);
	public MemberVO login(MemberVO vo);
}
