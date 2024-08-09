package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.SubEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubEntityRepository extends JpaRepository<SubEntity, Long> {

    List<SubEntity> findByEntityType_Id(Long id);
}
