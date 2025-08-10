package com.project.techlogcommon.constants;

import lombok.Getter;

@Getter
public enum Region {

	DOMESTIC("DOMESTIC", "국내"),
	OVERSEAS("OVERSEAS", "해외"),

	;

	private final String code;
	private final String display;

	Region(String code, String display) {
		this.code = code;
		this.display = display;
	}
}
