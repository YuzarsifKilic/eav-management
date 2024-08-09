package com.yuzarsif.eavmanagement.controller;

import com.yuzarsif.eavmanagement.dto.EntityTypeListDto;
import com.yuzarsif.eavmanagement.service.EntityTypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entities")
public class EntityTypeController {

    private final EntityTypeService entityService;

    public EntityTypeController(EntityTypeService entityService) {
        this.entityService = entityService;
    }

    @GetMapping
    public ResponseEntity<List<EntityTypeListDto>> getEntityTypes() {
        return ResponseEntity.ok(entityService.getEntityTypes());
    }
}
