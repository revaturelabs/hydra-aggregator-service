package com.revature.hydraaggregatorservice.model.skill;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.curriculum.Curriculum;
import com.revature.hydraaggregatorservice.model.trainers.Trainer;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"trainers", "curricula"})
@ToString(exclude = {"trainers", "curricula"})
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ColumnDefault("true")
    private boolean active;

    @JsonBackReference
    @ManyToMany(mappedBy = "skills")
    private Set<Curriculum> curricula;

    @JsonBackReference
    @ManyToMany(mappedBy = "skills")
    private Set<Trainer> trainers;
}
