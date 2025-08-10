package com.project.techlogcommon.constants;

import lombok.Getter;

@Getter
public enum Occupation {

	BACKEND("BE", "백엔드"),
	FRONTEND("FE", "프론트엔드"),
	AI("AI", "인공지능")


	;

	private final String code;
	private final String display;

	Occupation(String code, String display) {
		this.code = code;
		this.display = display;
	}
}
