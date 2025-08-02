package com.project.techlogapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RankPostResponse {
    private int rank;
    private Long postId;
    private String regionType;
    private String company;
    private String author;
    private String jobType;
    private String publishedAt;
    private String title;
    private LocalDateTime createdAt;
    private int viewCount;

//    public RankPostResponse from() {
//
//    }
}
