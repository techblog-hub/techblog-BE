package com.project.techlogapi.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostListResponse {
    private int totalCount;
    private List<PostResponse> postList;

    public static PostListResponse of(int totalCount, List<PostResponse> postList) {
        return PostListResponse.builder()
                .totalCount(totalCount)
                .postList(postList)
                .build();
    }
}
