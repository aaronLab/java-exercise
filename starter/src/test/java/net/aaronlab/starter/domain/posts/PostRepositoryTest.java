package net.aaronlab.starter.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void getAllPosts() {
        String title = "Test";
        String content = "Test Content";
        String author = "aaron@aaron.aaron";

        postsRepository.save(
                Posts
                        .builder()
                        .title(title)
                        .content(content)
                        .author(author)
                        .build()
        );

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);

        System.out.println(posts.getId());
        System.out.println(posts.getTitle());
        System.out.println(posts.getContent());
        System.out.println(posts.getAuthor());

        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
        assertThat(posts.getAuthor()).isEqualTo(author);
    }

}
