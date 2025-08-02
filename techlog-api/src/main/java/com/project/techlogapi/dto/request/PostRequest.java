package com.project.techlogapi.dto.request;

import jakarta.validation.constraints.Min;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class PostRequest {
    /**
     * 페이지
     */
    @Min(1)
    private int page = 1;

    /**
     * 노출개수
     */
    @Min(5)
    private int limit = 20;

    /**
     * 기업ID
     */
    private Long companyId;

    /**
     * 직군
     */
    private String jobType;

    /**
     * 국가
     */
    private String regionType;
}
