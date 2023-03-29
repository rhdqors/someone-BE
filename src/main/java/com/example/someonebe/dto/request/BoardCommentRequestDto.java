package com.example.someonebe.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardCommentRequestDto {

    private String title;
    private String nickname;
    private String comment;

}
