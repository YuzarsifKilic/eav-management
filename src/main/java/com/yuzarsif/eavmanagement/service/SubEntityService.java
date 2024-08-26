package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.dto.SubEntityListDto;
import com.yuzarsif.eavmanagement.model.SubEntity;
import com.yuzarsif.eavmanagement.repository.SubEntityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubEntityService {

    private final SubEntityRepository subEntityRepository;

    public SubEntityService(SubEntityRepository subEntityRepository) {
        this.subEntityRepository = subEntityRepository;
    }


    public List<SubEntityListDto> getSubEntitiesByEntityType(Long id) {
        return subEntityRepository
                .findByEntityType_Id(id)
                .stream()
                .map(SubEntityListDto::convert)
                .toList();
    }

    protected SubEntity getSubEntityById(Long id) {
        return subEntityRepository
                .findById(id)
                .orElse(null);
    }
}
