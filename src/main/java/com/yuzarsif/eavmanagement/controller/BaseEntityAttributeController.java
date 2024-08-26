package com.yuzarsif.eavmanagement.controller;

import com.yuzarsif.eavmanagement.dto.BaseEntityAttributeDto;
import com.yuzarsif.eavmanagement.dto.CreateBaseEntityRequest;
import com.yuzarsif.eavmanagement.service.BaseEntityAttributeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/base-entity-attributes")
public class BaseEntityAttributeController {

    private final BaseEntityAttributeService baseEntityAttributeService;

    public BaseEntityAttributeController(BaseEntityAttributeService baseEntityAttributeService) {
        this.baseEntityAttributeService = baseEntityAttributeService;
    }

    @PostMapping
    public ResponseEntity<String> createBaseEntityAttribute(@RequestBody List<CreateBaseEntityRequest> request) {
        baseEntityAttributeService.createBaseEntityAttribute(request);
        return ResponseEntity.ok("Created");
    }

    @GetMapping("/sub-entity/{id}")
    public ResponseEntity<List<BaseEntityAttributeDto>> getAttributesBySubEntity(@PathVariable Long id) {
        return ResponseEntity.ok(baseEntityAttributeService.getAttributesBySubEntity(id));
    }
}
