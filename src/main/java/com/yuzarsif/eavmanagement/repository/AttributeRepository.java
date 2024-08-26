package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttributeRepository extends JpaRepository<Attribute, Long> {

    List<Attribute> findBySubEntity_IdOrEntityType_Id(Long subEntityId, Long entityTypeId);
}
