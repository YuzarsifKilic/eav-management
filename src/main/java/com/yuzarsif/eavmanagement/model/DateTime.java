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

    @OneToOne
    @JoinColumn(name = "base_entity_attribute_id")
    private BaseEntityAttribute attribute;

    private LocalDateTime value;
}
