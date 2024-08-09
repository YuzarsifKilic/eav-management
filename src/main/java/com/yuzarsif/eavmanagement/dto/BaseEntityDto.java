package com.yuzarsif.eavmanagement.dto;

import com.yuzarsif.eavmanagement.model.BaseEntity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link com.yuzarsif.eavmanagement.model.BaseEntity}
 */
public record BaseEntityDto(
        Long id,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) implements Serializable {

    public static BaseEntityDto convert(BaseEntity from) {
        return new BaseEntityDto(
                from.getId(),
                from.getCreatedAt(),
                from.getUpdatedAt());
    }
}