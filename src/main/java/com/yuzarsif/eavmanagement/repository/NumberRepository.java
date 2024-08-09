package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number, Long> {
}
