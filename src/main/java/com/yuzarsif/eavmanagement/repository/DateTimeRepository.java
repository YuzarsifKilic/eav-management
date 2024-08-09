package com.yuzarsif.eavmanagement.repository;

import com.yuzarsif.eavmanagement.model.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateTimeRepository extends JpaRepository<DateTime, Long> {
}
