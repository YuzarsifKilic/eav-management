package com.yuzarsif.eavmanagement.controller;

import com.yuzarsif.eavmanagement.dto.BaseEntityDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/base-entities")
public class BaseEntityController {

    private final BaseEntityService baseEntityService;

    public BaseEntityController(BaseEntityService baseEntityService) {
        this.baseEntityService = baseEntityService;
    }

    @GetMapping
    public ResponseEntity<List<BaseEntityDto>> getBaseEntities() {
        return ResponseEntity.ok(baseEntityService.getBaseEntities());
    }
}
