package com.hsh.p61;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hsh.board.BoardDAO;
import com.hsh.board.BoardDTO;
	
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardDAO boardDAO;
	
	@RequestMapping("/view")
	public String getView(@RequestParam int num, Model model){
		try {
			BoardDTO bdDto = boardDAO.view(num);
			model.addAttribute("bdDto", bdDto);
			System.out.println("test"+bdDto.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/boardView";
	}
	
}








