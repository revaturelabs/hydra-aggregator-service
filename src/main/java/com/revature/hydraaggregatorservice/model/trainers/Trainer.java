package com.revature.hydraaggregatorservice.model.trainers;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.skill.Skill;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"skills"})
@ToString(exclude = {"skills"})
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String title;
    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "skill_trainer",
        joinColumns = @JoinColumn(name = "trainer_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> skills;

    @ColumnDefault("true")
    private boolean active;

    // TODO: Certifications

    // TODO: Resume's

    @Enumerated(EnumType.STRING)
    private Tier tier;

}