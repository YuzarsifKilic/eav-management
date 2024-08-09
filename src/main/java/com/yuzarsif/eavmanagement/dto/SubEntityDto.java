package com.yuzarsif.eavmanagement.dto;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.SubEntity}
 */
public record SubEntityDto(Long id, String name, Set<AttributeDto> attributes) implements Serializable {
}