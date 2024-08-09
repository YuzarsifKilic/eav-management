package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.DateTime;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.DateTime}
 */
public record DateTimeDto(Long id, LocalDateTime value) implements Serializable {

    public static DateTimeDto convert(DateTime from) {
        return new DateTimeDto(from.getId(), from.getValue());
    }

    public static List<DateTimeDto> convert(Set<DateTime> from) {
        return from.stream().map(DateTimeDto::convert).toList();
    }
}