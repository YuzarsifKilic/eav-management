package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.VarChar;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.VarChar}
 */
public record VarCharDto(Long id, String value) implements Serializable {

    public static VarCharDto convert(VarChar from) {
        return new VarCharDto(from.getId(), from.getValue());
    }

    public static List<VarCharDto> convert(Set<VarChar> from) {
        return from.stream().map(VarCharDto::convert).toList();
    }
}