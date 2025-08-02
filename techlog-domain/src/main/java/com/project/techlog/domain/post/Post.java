package com.project.techlog.domain.post;

import com.project.techlog.domain.company.Company;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(schema = "techlog", name="post")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "postId", nullable = false)
    private Long postId;

    @ManyToOne
    private Company company;

    @Column(name = "author")
    private String author;

    @Column(name = "jobType")
    private String jobType;

    @Column(name = "title")
    private String title;

    @Column(name = "summary")
    private String summary;

    @Column(name = "content")
    private String content;

    @Column(name = "publishedAt")
    private String publishedAt;

    @Column(name = "sourceUrl")
    private String sourceUrl;

    @Column(name = "viewCount")
    private int viewCount;

    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    // 게시글 이미지 url
    @Column(name = "createdAt")
    private String imageUrl;

    // 조회수 증가
    public void increaseViewCount() {
        this.viewCount += 1;
    }
}
