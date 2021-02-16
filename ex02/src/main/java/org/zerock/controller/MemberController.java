package org.zerock.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@GetMapping("/index")
	public void index() {
		
	}
	@PostMapping("/index")
	public String index(MemberVO member, HttpSession session) {
		
		MemberVO vo = service.login(member);
		
		session.setAttribute("aaaa", vo);

		
		if(session.getAttribute("aaaa") != null) {
			
			return "redirect:/";
		}else {
			return "redirect:/member/index ";
		}
		
	}
	
	@GetMapping("/join")
	public void join() {
		
	}
	@PostMapping("/join")
	public String  join(MemberVO vo,RedirectAttributes rttr) {
		
		service.join(vo);
		
		rttr.addFlashAttribute("id",vo.getId());
		rttr.addFlashAttribute("pw",vo.getPw());
		
		return "redirect:/member/index";
	}
	@PostMapping("/logout")
	public void logout(HttpSession session) {		
		
		session.removeAttribute("aaaa");
	}

}
