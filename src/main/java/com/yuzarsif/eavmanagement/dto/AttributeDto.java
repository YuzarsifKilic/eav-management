package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.Attribute;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.Attribute}
 */
public record AttributeDto(
        Long id, String name,
        String displayName,
        String description,
        String valueType,
        Boolean isReadOnly,
        Boolean isRequired) implements Serializable {

    public static AttributeDto convert(Attribute from) {
        return new AttributeDto(
                from.getId(),
                from.getName(),
                from.getDisplayName(),
                from.getDescription(),
                from.getValueType(),
                from.getIsReadOnly(),
                from.getIsRequired());
    }

    public static List<AttributeDto> convert(Set<Attribute> from) {
        return from.stream().map(AttributeDto::convert).toList();
    }
}