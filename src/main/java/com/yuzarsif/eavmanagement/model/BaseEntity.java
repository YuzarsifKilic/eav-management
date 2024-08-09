package com.yuzarsif.eavmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @OneToMany(mappedBy = "baseEntity", cascade = CascadeType.REMOVE)
    private Set<VarChar> varChars;

    @OneToMany(mappedBy = "baseEntity", cascade = CascadeType.REMOVE)
    private Set<Boolean> booleans;

    @OneToMany(mappedBy = "baseEntity", cascade = CascadeType.REMOVE)
    private Set<Number> numbers;

    @OneToMany(mappedBy = "baseEntity", cascade = CascadeType.REMOVE)
    private Set<DateTime> dateTimes;
}
