package com.catalog.admin.application;

import com.catalog.admin.domain.category.Category;
import com.catalog.admin.domain.category.CategoryID;

public class UseCase {


    public Category execute() {
        return new Category(CategoryID.unique(), "bb", "cc", false, null, null, null);
    }
}