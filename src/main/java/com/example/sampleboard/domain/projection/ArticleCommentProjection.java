package com.example.sampleboard.domain.projection;

import com.example.sampleboard.domain.ArticleComment;
import com.example.sampleboard.domain.UserAccount;
import java.time.LocalDateTime;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "withUserAccount", types = ArticleComment.class)
public interface ArticleCommentProjection {
    Long getId();
    UserAccount getUserAccount();
    Long getParentCommentId();
    String getContent();
    LocalDateTime getCreatedAt();
    String getCreatedBy();
    LocalDateTime getModifiedAt();
    String getModifiedBy();
}