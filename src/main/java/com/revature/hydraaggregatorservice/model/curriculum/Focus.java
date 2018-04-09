package com.revature.hydraaggregatorservice.model.curriculum;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.skill.Skill;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"skills", "curricula"})
@ToString(exclude = {"skills", "curricula"})
public class Focus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ColumnDefault("true")
    private Boolean active;

    @JsonBackReference
    @ManyToMany(mappedBy = "focuses")
    private Set<Curriculum> curricula;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "focus_skill",
        joinColumns = {@JoinColumn(name = "focus_id")},
        inverseJoinColumns = {@JoinColumn(name = "skill_id")}
    )
    private Set<Skill> skills;
}
