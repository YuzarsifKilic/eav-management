package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.repository.DateTimeRepository;
import org.springframework.stereotype.Service;

@Service
public class DateTimeService {

    private final DateTimeRepository dateTimeRepository;

    public DateTimeService(DateTimeRepository dateTimeRepository) {
        this.dateTimeRepository = dateTimeRepository;
    }
}
