package com.catalog.admin.domain.validation;

import java.util.List;

/**
 * Interface fluente: Possibilidade de chamar um método e chamar a própria instância encadeando chamada de métodos
 */
public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    default boolean hasError() {
        return getErrors() != null && !(getErrors().isEmpty());
    }

    List<Error> getErrors();

    public interface Validation {
        void validate();
    }

}
