package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.AttributeListDto;
import com.yuzarsif.eavmanagement.model.Attribute;
import com.yuzarsif.eavmanagement.repository.AttributeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttributeService {

    private final AttributeRepository attributeRepository;

    public AttributeService(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }

    protected List<Attribute> getAttributesBySubEntities(Long id) {
        return attributeRepository
                .findBySubEntity_Id(id);
    }

    public List<AttributeListDto> getAttributesBySubEntity(Long id) {
        return attributeRepository
                .findBySubEntity_Id(id)
                .stream()
                .map(AttributeListDto::convert)
                .toList();
    }
}
