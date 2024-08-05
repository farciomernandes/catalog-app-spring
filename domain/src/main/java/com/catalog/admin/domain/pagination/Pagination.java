package com.catalog.admin.domain.pagination;

import java.util.List;

public record Pagination<T>(
        int curentPage,
        int perPage,
        long total,
        List<T> items
) {
}
