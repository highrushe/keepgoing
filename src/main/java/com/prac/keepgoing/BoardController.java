package com.prac.keepgoing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prac.keepgoing.bean.BoardVO;
import com.prac.keepgoing.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired(required = true)
	private BoardService service;

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public void createGET(BoardVO board, Model model) throws Exception {
		System.out.println("/board/create ...Method:GET");
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String createPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		System.out.println("/board/create ...Method:POST");
		System.out.println(board.toString());
		/*
		 * RedirectAttributes : 리다이렉트 시점에 한 번만 사용되는 데이터 + URL상에는 보이지 않는 숨겨진 데이터 형태로 전달
		 */
		service.create(board);
//		model.addAttribute("result", "성공");
//		return "/board/success";
		rttr.addFlashAttribute("msg", "성공");
		return "redirect:/board/listAll";
	}

	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public void listAll(Model model) throws Exception {
		System.out.println("All list memeber page");
//		List<BoardVO> vo = service.listAll();
		model.addAttribute("boardList", service.listAll());
	}
	
	@RequestMapping(value= "/detail", method = RequestMethod.GET)
	public void detail(@RequestParam("no") int no, Model model) throws Exception{
		System.out.println("Content Number : " + no + "detail Page");
		model.addAttribute(service.read(no));
	}

}
