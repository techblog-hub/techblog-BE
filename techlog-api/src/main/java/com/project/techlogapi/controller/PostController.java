package com.project.techlogapi.controller;

import com.project.techlogapi.dto.request.PostRequest;
import com.project.techlogapi.dto.response.PostListResponse;
import com.project.techlogapi.dto.response.PostResponse;
import com.project.techlogapi.dto.response.RankListResponse;
import com.project.techlogapi.service.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/posts")
public class PostController {

    private final PostService postService;

    /**
     * 기술블로그 목록 조회
     * @param request
     * @return
     */
    @GetMapping
    public ResponseEntity<PostListResponse> getPostList(@Valid PostRequest request) {
        return ResponseEntity.ok(postService.getAllPostResponse(request));
    }

    /**
     * 기술블로그 상세 조회
     * @param postId
     * @return
     */
    @GetMapping("/{postId}")
    public ResponseEntity<PostResponse> getPostDetail(@PathVariable(name = "postId") Long postId) {
        return ResponseEntity.ok(postService.getPostResponse(postId));
    }

    /**
     * 기술블로그 검색 결과 조회
     * @param keyword
     * @param page
     * @param limit
     * @return
     */
    @GetMapping("/search")
    public ResponseEntity<PostListResponse> getSearchList(
            @RequestParam(name = "keyword") String keyword,
            @RequestParam(name = "page", required = false, defaultValue = "1") int page,
            @RequestParam(name = "limit", required = false, defaultValue = "20") int limit
    ) {
        return ResponseEntity.ok(postService.getSearchResponse(keyword, page, limit));
    }

    /**
     * ✅ figma 확인 필요
     * 검색어 랭킹 조회
     * @param limit
     * @return
     */
    @GetMapping("/keyword-rank")
    public ResponseEntity<RankListResponse> getKeywordRankList(
            @RequestParam(name = "limit", required = false, defaultValue = "5") int limit
    ) {
        return ResponseEntity.ok(postService.getKeywordRankList(limit));
    }

    /**
     * 조회수 증가
     * @param postId
     * @return
     */
    @PutMapping("/{postId}/views")
    public ResponseEntity<Void> increasePostView(@PathVariable(name = "postId") Long postId) {
        postService.increasePostView(postId);
        return ResponseEntity.ok().build();
    }
}
