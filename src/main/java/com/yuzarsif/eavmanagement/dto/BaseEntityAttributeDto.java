package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.BaseEntityAttribute;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.BaseEntityAttribute}
 */
public record BaseEntityAttributeDto(Long id, AttributeDto attribute, Object value) implements Serializable {

    public static BaseEntityAttributeDto convert(BaseEntityAttribute from) {
        Object value;
        if (from.getVarChar() != null) {
            value = from.getVarChar().getValue();
        } else if (from.getBooleanValue() != null) {
            value = from.getBooleanValue().getValue();
        } else if (from.getNumber() != null) {
            value = from.getNumber().getValue();
        } else if (from.getDateTime() != null) {
            value = from.getDateTime().getValue();
        } else {
            value = null;
        }
      return new BaseEntityAttributeDto(
        from.getId(),
        AttributeDto.convert(from.getAttribute()),
        value);
    }

    public static List<BaseEntityAttributeDto> convert(List<BaseEntityAttribute> from) {
        return from.stream().map(BaseEntityAttributeDto::convert).toList();
    }
}