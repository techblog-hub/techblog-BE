package com.project.techlogdomain.entity;

import com.project.techlogcommon.common.BaseEntity;
import com.project.techlogcommon.constants.Region;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Company extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;

	@Enumerated(EnumType.STRING)
	private Region region;
}
