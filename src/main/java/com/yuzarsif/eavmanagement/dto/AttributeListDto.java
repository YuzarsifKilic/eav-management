package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.Attribute;

import java.io.Serializable;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.Attribute}
 */
public record AttributeListDto(Long id, String name, String displayName, String description, String valueType,
                               Boolean isReadOnly, Boolean isRequired) implements Serializable {

  public static AttributeListDto convert(Attribute from) {
    return new AttributeListDto(from.getId(),
            from.getName(),
            from.getDisplayName(),
            from.getDescription(),
            from.getValueType(),
            from.getIsReadOnly(),
            from.getIsRequired());
  }
}