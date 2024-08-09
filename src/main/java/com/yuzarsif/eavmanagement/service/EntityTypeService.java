package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.EntityTypeListDto;
import com.yuzarsif.eavmanagement.repository.EntityTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityTypeService {

    private final EntityTypeRepository entityTypeRepository;

    public EntityTypeService(EntityTypeRepository entityTypeRepository) {
        this.entityTypeRepository = entityTypeRepository;
    }

    public List<EntityTypeListDto> getEntityTypes() {
        return entityTypeRepository
                .findAll()
                .stream()
                .map(EntityTypeListDto::convert)
                .toList();
    }
}
