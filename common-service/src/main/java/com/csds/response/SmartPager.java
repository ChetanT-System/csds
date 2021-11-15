package com.csds.response;

import lombok.Data;

@Data
public class SmartPager {

	private Integer currentPage = 0;
	private Long totalItems;
	private Integer totalPages;
}
