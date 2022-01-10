package board.controller;
// Client 요청을 받아서 해당 요청을 수행하는데 필요한 Business Logic을 호출하고
// 그 결과를 포함하여 응답을 제공하는 디스패처(Dispatcher)역할을 수행

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	@RequestMapping("/board/openBoardList.do")
	public ModelAndView openBoardList() throws Exception {
		ModelAndView mv = new ModelAndView("/board/boardList");
		
		
		
		return mv;
	}
}
