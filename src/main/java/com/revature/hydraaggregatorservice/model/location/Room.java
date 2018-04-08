package com.revature.hydraaggregatorservice.model.location;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ColumnDefault("true")
    private boolean active;

    private String name;

    @JoinColumn(name = "building_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Building building;

}