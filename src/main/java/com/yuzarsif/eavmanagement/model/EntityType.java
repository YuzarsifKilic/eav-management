package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EntityType {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String entityName;

    @OneToMany(mappedBy = "entityType", cascade = CascadeType.REMOVE)
    private Set<SubEntity> subEntities;

    @OneToMany(mappedBy = "entityType", cascade = CascadeType.REMOVE)
    private Set<Attribute> attributes;
}
