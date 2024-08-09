package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "date_time_values")
public class DateTime {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "base_entity_attribute_id")
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "base_entity_id")
    private BaseEntity baseEntity;

    private LocalDateTime value;
}
