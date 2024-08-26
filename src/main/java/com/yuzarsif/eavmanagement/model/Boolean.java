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

    @OneToOne
    @JoinColumn(name = "base_entity_attribute_id")
    private BaseEntityAttribute attribute;

    private java.lang.Boolean value;
}
