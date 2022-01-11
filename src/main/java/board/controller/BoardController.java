package board.controller;
// Client 요청을 받아서 해당 요청을 수행하는데 필요한 Business Logic을 호출하고
// 그 결과를 포함하여 응답을 제공하는 디스패처(Dispatcher)역할을 수행

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.dto.BoardDto;
import board.service.BoardService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/board/openBoardList.do")
	public ModelAndView openBoardList() throws Exception {
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		List<BoardDto> data = boardService.selectBoardList();
		mv.addObject("resultList", data);
		
		return mv;
	}
	
	// 게시글 등록 페이지에 대한 요청을 처리하는 컨트롤러
	@RequestMapping("/board/openBoardWrite.do")
	public String openBoardWrite() throws Exception {
		return "/board/boardWrite";
	}
	
	@RequestMapping("/board/insertBoard.do")
	public String insertBoard(BoardDto board) throws Exception {
		boardService.insertBoard(board);
		return "redirect:/board/openBoardList.do";
	}
	
	@RequestMapping("/board/openBoardDetail.do")
	public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception {
		log.trace("trace openBoardList()");
		log.debug("debug openBoardList()");
		log.info("info openBoardList()");
		log.warn("warn openBoardList()");
		log.error("error openBoardList()");
		ModelAndView mv = new ModelAndView("/board/boardDetail");
		
		BoardDto data = boardService.selectBoardDetail(boardIdx);
		mv.addObject("resultDetail", data);
		
		return mv;
	}
}
