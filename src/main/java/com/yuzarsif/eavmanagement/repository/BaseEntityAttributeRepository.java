package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.BaseEntityAttribute;
import com.yuzarsif.eavmanagement.model.SubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseEntityAttributeRepository extends JpaRepository<BaseEntityAttribute, Long> {

    List<BaseEntityAttribute> findByAttribute_SubEntity(SubEntity subEntity);
}
