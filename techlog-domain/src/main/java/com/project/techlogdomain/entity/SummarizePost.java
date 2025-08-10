package com.project.techlogdomain.entity;

import com.project.techlogcommon.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SummarizePost extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = LAZY)
	private Post post;

	@Lob @Column(name = "content", columnDefinition = "TEXT")
	private String content;
}
