package com.example.sampleboard.repository.querydsl;

import com.example.sampleboard.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

public interface ArticleRepositoryCustom {
    List<String> findAllDistinctHashtags();
}