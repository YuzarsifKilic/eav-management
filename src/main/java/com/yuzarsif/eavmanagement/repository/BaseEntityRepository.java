package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.BaseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {

    @Query("SELECT b FROM BaseEntity b JOIN b.baseEntityAttributes bea JOIN bea.attribute a WHERE a.subEntity.id = :subEntityId")
    List<BaseEntity> findBySubEntity(Long subEntityId, Pageable pageable);
}
