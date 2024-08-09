package com.yuzarsif.eavmanagement.controller;

import com.yuzarsif.eavmanagement.dto.AttributeListDto;
import com.yuzarsif.eavmanagement.service.AttributeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/attributes")
public class AttributeController {

    private final AttributeService attributeService;

    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    @GetMapping("sub-entity/{id}")
    public ResponseEntity<List<AttributeListDto>> getAttributesBySubEntity(@PathVariable Long id) {
        return ResponseEntity.ok(attributeService.getAttributesBySubEntity(id));
    }
}
