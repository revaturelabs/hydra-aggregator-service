package com.revature.hydraaggregatorservice.model.location;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.unavailable.Unavailable;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"unavailabilities"})
@ToString(exclude = {"unavailabilities"})
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ColumnDefault("true")
    private boolean active;

    private String roomName;

    @JsonBackReference
    @JoinColumn(name = "building_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private Building building;

    @OneToMany(mappedBy = "room")
    private Set<Unavailable> unavailabilities;
}