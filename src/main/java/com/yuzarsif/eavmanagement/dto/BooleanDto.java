package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.Boolean;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.Boolean}
 */
public record BooleanDto(Long id, java.lang.Boolean value) implements Serializable {

    public static BooleanDto convert(Boolean from) {
        return new BooleanDto(from.getId(), from.getValue());
    }

    public static List<BooleanDto> convert(Set<Boolean> from) {
        return from.stream().map(BooleanDto::convert).toList();
    }
}