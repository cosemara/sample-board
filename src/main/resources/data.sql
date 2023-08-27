INSERT INTO article (title, content, create_at, create_by, modified_at, modified_by, hashtag) VALUES ('title1', 'content1', now(), 'test', now(), 'test', '#spring');

INSERT INTO article_comment (article_id, content, create_at, create_by, modified_at, modified_by) VALUES (1, 'content', now(), 'test', now(), 'test');