package com.project.techlogapi.service;

import com.project.techlog.domain.post.Post;
import com.project.techlog.domain.post.PostRepository;
import com.project.techlogapi.dto.request.PostRequest;
import com.project.techlogapi.dto.response.PostListResponse;
import com.project.techlogapi.dto.response.PostResponse;
import com.project.techlogapi.dto.response.RankListResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    /**
     * 기술블로그 목록 조회
     * @param request
     * @return
     */
    @Transactional(readOnly = true)
    public PostListResponse getAllPostResponse(PostRequest request) {
//        List<Post> posts = postRepository.findList(request).orElseThrow(() -> new PostNotFoundException(postId)); //request 조건
        List<Post> posts = Collections.emptyList();
        List<PostResponse> convertedList = posts.stream()
                .map(PostResponse::from)
                .toList();
        return PostListResponse.of(convertedList.size(), convertedList);
    }

    /**
     * 기술블로그 상세 조회
     * @param postId
     * @return
     */
    @Transactional(readOnly = true)
    public PostResponse getPostResponse(Long postId) {
//        Post post = postRepository.findById(postId).orElseThrow(() -> new PostNotFoundException(postId));
        Post post = null;
        return PostResponse.from(post);
    }

    /**
     * 검색 결과 조회
     * @param keyword
     * @param page
     * @param limit
     * @return
     */
    @Transactional(readOnly = true)
    public PostListResponse getSearchResponse(String keyword, int page, int limit) {
//        List<Post> posts = postRepository.findSearchList(keyword, page, limit); //request 조건
        List<Post> posts = Collections.emptyList();
        List<PostResponse> convertedList = posts.stream()
                .map(PostResponse::from)
                .toList();
        return PostListResponse.of(convertedList.size(), convertedList);
    }

    /**
     * 랭킹 리스트 조회
     * @param limit
     * @return
     */
    @Transactional(readOnly = true)
    public RankListResponse getKeywordRankList(int limit) {
        return new RankListResponse();
    }

    /**
     * 조회수 증가
     * @param postId
     */
    @Transactional
    public void increasePostView(Long postId) {
//        Post post = postRepository.findById(postId).orElseThrow(() -> new PostNotFoundException(postId));
        Post post = null;
        post.increaseViewCount();
    }

}
