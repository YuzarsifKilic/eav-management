package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.Number;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.Number}
 */
public record NumberDto(Long id, Double value) implements Serializable {

    public static NumberDto convert(Number from) {
        return new NumberDto(from.getId(), from.getValue());
    }

    public static List<NumberDto> convert(Set<Number> from) {
        return from.stream().map(NumberDto::convert).toList();
    }
}