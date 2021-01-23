package net.aaronlab.starter.service.posts;

import lombok.RequiredArgsConstructor;
import net.aaronlab.starter.domain.posts.PostsRepository;
import net.aaronlab.starter.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository
                .save(
                        requestDto.toEntity()
                ).getId();
    }
}
