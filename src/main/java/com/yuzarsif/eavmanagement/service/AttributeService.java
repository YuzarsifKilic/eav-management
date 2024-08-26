package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.AttributeListDto;
import com.yuzarsif.eavmanagement.model.Attribute;
import com.yuzarsif.eavmanagement.model.SubEntity;
import com.yuzarsif.eavmanagement.repository.AttributeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeService {

    private final AttributeRepository attributeRepository;
    private final SubEntityService subEntityService;

    public AttributeService(AttributeRepository attributeRepository, SubEntityService subEntityService) {
        this.attributeRepository = attributeRepository;
        this.subEntityService = subEntityService;
    }

    public List<AttributeListDto> getAttributesBySubEntity(Long id) {
        SubEntity subEntityById = subEntityService.getSubEntityById(id);
        return attributeRepository
                .findBySubEntity_IdOrEntityType_Id(subEntityById.getId(), subEntityById.getEntityType().getId())
                .stream()
                .map(AttributeListDto::convert)
                .toList();
    }

    protected Attribute findAttributeById(Long id) {
        return attributeRepository
                .findById(id)
                .orElse(null);
    }
}
