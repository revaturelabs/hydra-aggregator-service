package com.revature.hydraaggregatorservice.model.location;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"rooms"})
@ToString(exclude = {"rooms"})
@Entity
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ColumnDefault("true")
    private boolean active;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    private String name;

    @OneToMany(mappedBy = "building")
    private Set<Room> rooms;
}