package com.example.sampleboard.repository.querydsl;

import com.example.sampleboard.domain.Hashtag;
import com.example.sampleboard.domain.QHashtag;
import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class HashtagRepositoryCustomImpl extends QuerydslRepositorySupport implements HashtagRepositoryCustom {

    public HashtagRepositoryCustomImpl() {
        super(Hashtag.class);
    }

    @Override
    public List<String> findAllHashtagNames() {
        QHashtag hashtag = QHashtag.hashtag;

        return from(hashtag)
            .select(hashtag.hashtagName)
            .fetch();
    }

}