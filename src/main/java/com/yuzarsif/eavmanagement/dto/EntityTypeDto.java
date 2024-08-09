package com.yuzarsif.eavmanagement.dto;

import java.io.Serializable;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.EntityType}
 */
public record EntityTypeDto(Long id, String entityName, Set<SubEntityDto> subEntities) implements Serializable {
}