package com.yuzarsif.eavmanagement.controller;

import com.yuzarsif.eavmanagement.dto.SubEntityDto;
import com.yuzarsif.eavmanagement.dto.SubEntityListDto;
import com.yuzarsif.eavmanagement.service.SubEntityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sub-entities")
public class SubEntityController {

    private final SubEntityService subEntityService;

    public SubEntityController(SubEntityService subEntityService) {
        this.subEntityService = subEntityService;
    }

    @GetMapping("/entity-type/{id}")
    public ResponseEntity<List<SubEntityListDto>> getSubEntitiesByEntityType(@PathVariable Long id) {
        return ResponseEntity.ok(subEntityService.getSubEntitiesByEntityType(id));
    }
}
