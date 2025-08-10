package com.project.techlogdomain.entity;

import com.project.techlogcommon.common.BaseEntity;
import com.project.techlogcommon.constants.Occupation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = LAZY)
	private Company company;

	private String title;

	@Lob @Column(name = "content", columnDefinition = "TEXT")
	private String content;

	private LocalDateTime publishedAt;

	private int views;

	private String sourceUrl;

	@Enumerated(EnumType.STRING)
	private Occupation occupation;
}
