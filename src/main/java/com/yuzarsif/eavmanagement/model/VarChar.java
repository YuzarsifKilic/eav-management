package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "varchar_values")
public class VarChar {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "base_entity_attribute_id")
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "base_entity_id")
    private BaseEntity baseEntity;

    private String value;
}
