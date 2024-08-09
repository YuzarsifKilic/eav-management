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
public class Attribute {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    private String displayName;
    private String description;
    private String valueType;
    private java.lang.Boolean isReadOnly;
    private java.lang.Boolean isRequired;
    @ManyToOne
    @JoinColumn(name = "sub_entity_id")
    private SubEntity subEntity;

    // TODO: Add Entity Type but it will be nullable
    @ManyToOne
    @JoinColumn(name = "entity_type_id")
    private EntityType entityType;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.REMOVE)
    private Set<VarChar> varChars;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.REMOVE)
    private Set<Boolean> booleans;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.REMOVE)
    private Set<Number> numbers;

    @OneToMany(mappedBy = "attribute", cascade = CascadeType.REMOVE)
    private Set<DateTime> dateTimes;

}
