package com.example.sampleboard.dto;

public record ArticleCommentUpdateDto(String title, String content) {
    public static ArticleCommentUpdateDto of(String title, String content) {
        return new ArticleCommentUpdateDto(title, content);
    }
}
