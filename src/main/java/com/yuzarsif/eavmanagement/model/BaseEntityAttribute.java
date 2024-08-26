package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BaseEntityAttribute {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    @ManyToOne
    @JoinColumn(name = "base_entity_id")
    private BaseEntity baseEntity;

    @OneToOne(mappedBy = "attribute")
    private VarChar varChar;

    @OneToOne(mappedBy = "attribute")
    private Boolean booleanValue;

    @OneToOne(mappedBy = "attribute")
    private Number number;

    @OneToOne(mappedBy = "attribute")
    private DateTime dateTime;
}
