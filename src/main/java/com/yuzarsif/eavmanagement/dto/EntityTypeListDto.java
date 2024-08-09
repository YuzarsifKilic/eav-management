package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.EntityType;

import java.io.Serializable;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.EntityType}
 */
public record EntityTypeListDto(Long id, String entityName) implements Serializable {

  public static EntityTypeListDto convert(EntityType from) {
    return new EntityTypeListDto(from.getId(), from.getEntityName());
  }
}