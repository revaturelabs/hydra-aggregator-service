package com.revature.hydraaggregatorservice.model.trainers;

import com.revature.hydraaggregatorservice.model.skill.Skill;
import com.revature.hydraaggregatorservice.model.unavailable.Unavailable;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EqualsAndHashCode(exclude = {"skills"})
@ToString(exclude = {"skills"})
@Builder
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private byte[] certifications;
    private byte[] resume;

    @OneToMany
    @JoinColumn(name = "unavailable_id")
    private Set<Unavailable> unavailabilities;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "skill_trainer",
        joinColumns = @JoinColumn(name = "trainer_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> skills;

    @ColumnDefault("true")
    private boolean active;

    @Enumerated(EnumType.STRING)
    private Tier tier;

}