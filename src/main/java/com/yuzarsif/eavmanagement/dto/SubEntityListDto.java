package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.SubEntity;

import java.io.Serializable;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.SubEntity}
 */
public record SubEntityListDto(Long id, String name) implements Serializable {

  public static SubEntityListDto convert(SubEntity from) {
    return new SubEntityListDto(from.getId(), from.getName());
  }
}