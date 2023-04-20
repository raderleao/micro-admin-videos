package com.raderleao.admin.catalogo.domain.genre;

import com.raderleao.admin.catalogo.domain.Identifier;
import com.raderleao.admin.catalogo.domain.category.CategoryID;
import com.raderleao.admin.catalogo.domain.utils.IdUtils;

import java.util.Objects;
import java.util.UUID;

public class GenreID extends Identifier {

    private final String value;

    private GenreID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static GenreID from (final String anId) {
        return new GenreID(anId);
    }

    public static GenreID unique() {
        return GenreID.from(IdUtils.uuid());
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenreID that = (GenreID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}

