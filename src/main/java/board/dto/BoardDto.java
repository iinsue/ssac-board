package board.dto;

import lombok.Data;
// DTO : Application 내의 각 계층 사이의 데이터를 주고 받는데 사용되는 객체

// 모든 필드의 getter, setter, toString, hashCode, equals 메서드를 자동으로 생성
@Data
public class BoardDto {
	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String createdDatetime;
	private String createId;
	private String updatedDatetime;
	private String updatorId;
}
