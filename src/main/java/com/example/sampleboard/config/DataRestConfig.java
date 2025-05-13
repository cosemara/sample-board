package com.example.sampleboard.config;

import com.example.sampleboard.domain.Article;
import com.example.sampleboard.domain.ArticleComment;
import com.example.sampleboard.domain.Hashtag;
import com.example.sampleboard.domain.UserAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class DataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return RepositoryRestConfigurer.withConfig((config, cors) ->
           config.exposeIdsFor(UserAccount.class)
                 .exposeIdsFor(Article.class)
                 .exposeIdsFor(ArticleComment.class)
                 .exposeIdsFor(Hashtag.class)
        );
    }
}
