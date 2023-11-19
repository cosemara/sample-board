package com.example.sampleboard.controller;

import com.example.sampleboard.domain.type.FormStatus;
import com.example.sampleboard.domain.type.SearchType;
import com.example.sampleboard.dto.UserAccountDto;
import com.example.sampleboard.dto.request.ArticleCommentRequest;
import com.example.sampleboard.dto.request.ArticleRequest;
import com.example.sampleboard.dto.response.ArticleResponse;
import com.example.sampleboard.dto.response.ArticleWithCommentsResponse;
import com.example.sampleboard.service.ArticleCommentService;
import com.example.sampleboard.service.ArticleService;
import com.example.sampleboard.service.PaginationService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/comments")
@Controller
public class ArticleCommentController {

    private final ArticleCommentService articleCommentService;
    private final PaginationService paginationService;

    @PostMapping("/new")
    public String postNewArticleComment(ArticleCommentRequest articleCommentRequest) {
        articleCommentService.saveArticleComment(articleCommentRequest.toDto(UserAccountDto.of(
                "test", "pw", "test@mail.com", null, null
        )));

        return "redirect:/articles/" + articleCommentRequest.articleId();
    }

    @PostMapping ("/{commentId}/delete")
    public String deleteArticleComment(@PathVariable Long commentId, Long articleId) {
        articleCommentService.deleteArticleComment(commentId);

        return "redirect:/articles/" + articleId;
    }
}
