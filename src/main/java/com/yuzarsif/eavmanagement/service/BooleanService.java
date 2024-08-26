package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.model.Boolean;
import com.yuzarsif.eavmanagement.repository.BooleanRepository;
import org.springframework.stereotype.Service;

@Service
public class BooleanService {

    private final BooleanRepository booleanRepository;

    public BooleanService(BooleanRepository booleanRepository) {
        this.booleanRepository = booleanRepository;
    }

    protected void createBoolean(Boolean booleanValue) {
        booleanRepository.save(booleanValue);
    }
}
