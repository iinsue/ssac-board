package board.dto;

import lombok.Data;
// DTO : Application 내의 각 계층 사이의 데이터를 주고 받는데 사용되는 객체

@Data
public class BoardDto {
	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String createdDatetime;
	private String creatorId;
	private String updatedDatetime;
	private String updatorId;
}
