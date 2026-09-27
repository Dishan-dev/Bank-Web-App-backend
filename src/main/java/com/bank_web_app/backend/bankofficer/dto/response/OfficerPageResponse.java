package com.bank_web_app.backend.bankofficer.dto.response;

import java.util.List;

/** Standard page envelope for bank-officer list endpoints. */
public record OfficerPageResponse<T>(
	List<T> content,
	int page,
	int size,
	long totalElements,
	int totalPages
) {}
