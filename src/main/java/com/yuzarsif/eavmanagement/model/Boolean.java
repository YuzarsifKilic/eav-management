package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "boolean_values")
public class Boolean {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "base_entity_attribute_id")
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "base_entity_id")
    private BaseEntity baseEntity;

    private java.lang.Boolean value;
}
