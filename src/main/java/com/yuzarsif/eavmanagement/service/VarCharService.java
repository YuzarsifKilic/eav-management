package com.yuzarsif.eavmanagement.service;

import com.yuzarsif.eavmanagement.repository.VarCharRepository;
import org.springframework.stereotype.Service;

@Service
public class VarCharService {

    private final VarCharRepository varCharRepository;

    public VarCharService(VarCharRepository varCharRepository) {
        this.varCharRepository = varCharRepository;
    }
}
