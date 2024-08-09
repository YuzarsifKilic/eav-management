package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseEntityRepository extends JpaRepository<BaseEntity, Long> {
}
