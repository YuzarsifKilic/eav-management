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
public class SubEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "entity_type_id")
    private EntityType entityType;
    @OneToMany(mappedBy = "subEntity", cascade = CascadeType.REMOVE)
    private Set<Attribute> attributes;
}
