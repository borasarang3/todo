package com.woori.todo.DTO;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Builder 변수들을 DTO 만드는 작업
//ToString DTO를 변수로 출력
public class TodoDTO {
    private Integer id; //일련번호
    private String a; //제목
    private String b; //해야할 일
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate c; //날짜
    private String d; //중요도
    private String e; //상태
    private LocalDateTime regdate;
    private LocalDateTime moddate;
}
