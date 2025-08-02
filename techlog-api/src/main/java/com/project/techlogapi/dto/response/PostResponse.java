package com.project.techlogapi.dto.response;

import com.project.techlog.domain.post.Post;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {

    private Long postId;
    private String regionType;
    private String company;
    private String author;
    private String jobType;
    private String publishedAt;
    private String title;
    private String summary;
    private LocalDateTime createdAt;
    private Integer viewCount;

    public static PostResponse from(Post post) {
        return new PostResponse();
        // post null check
//        return PostResponse.builder()
//                .postId(post.getId())
//                .regionType(post.getRegionType())
//                .company(post.getCompany())
//                .author(post.getAuthor())
//                .jobType(post.getJobType())
//                .publishedAt(post.getPublishedAt().toString()) // 예시
//                .title(post.getTitle())
//                .summary(post.getSummary())
//                .createdAt(post.getCreatedAt())
//                .viewCount(post.getViewCount())
//                .build();
    }
}
