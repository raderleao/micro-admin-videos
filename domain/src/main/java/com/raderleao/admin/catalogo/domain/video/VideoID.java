package com.raderleao.admin.catalogo.domain.video;

import com.raderleao.admin.catalogo.domain.Identifier;
import com.raderleao.admin.catalogo.domain.category.CategoryID;
import com.raderleao.admin.catalogo.domain.utils.IdUtils;

import java.util.Objects;
import java.util.UUID;

public class VideoID extends Identifier {
    private final String value;

    private VideoID(final String value) {
        Objects.requireNonNull(value);
        this.value = value;
    }

    public static VideoID from (final String anId) {
        return new VideoID(anId);
    }

    public static VideoID unique() {
        return VideoID.from(IdUtils.uuid());
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoID that = (VideoID) o;
        return getValue().equals(that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}

