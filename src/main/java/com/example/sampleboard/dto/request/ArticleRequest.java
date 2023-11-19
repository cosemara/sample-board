package com.example.sampleboard.dto.request;

import com.example.sampleboard.dto.ArticleDto;
import com.example.sampleboard.dto.HashtagDto;
import com.example.sampleboard.dto.UserAccountDto;

import java.util.Set;

public record ArticleRequest(
        String title,
        String content,
        String hashtag
) {

    public static ArticleRequest of(String title, String content, String hashtag) {
        return new ArticleRequest(title, content, hashtag);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                hashtag
        );
    }

}