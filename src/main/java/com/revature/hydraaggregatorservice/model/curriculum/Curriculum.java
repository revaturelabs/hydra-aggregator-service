package com.revature.hydraaggregatorservice.model.curriculum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.revature.hydraaggregatorservice.model.skill.Skill;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EqualsAndHashCode(exclude = {"skills", "focuses"})
@ToString(exclude = {"skills", "focuses"})
public class Curriculum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Boolean active;
    private Boolean core;

    @JsonIdentityReference
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "curriculum_focus",
        joinColumns = @JoinColumn(name = "cid"),
        inverseJoinColumns = @JoinColumn(name = "fid")
    )
    private Set<Focus> focuses;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "curriculum_skill",
        joinColumns = {@JoinColumn(name = "curriculum_id")},
        inverseJoinColumns = {@JoinColumn(name = "skill_id")}
    )
    private Set<Skill> skills;
}
