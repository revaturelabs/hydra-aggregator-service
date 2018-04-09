package com.revature.hydraaggregatorservice.model.skill;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.batch.Batch;
import com.revature.hydraaggregatorservice.model.curriculum.Curriculum;
import com.revature.hydraaggregatorservice.model.curriculum.Focus;
import com.revature.hydraaggregatorservice.model.trainers.Trainer;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EqualsAndHashCode(exclude = {"trainers", "curricula", "batches", "focuses"})
@ToString(exclude = {"trainers", "curricula", "batches", "focuses"})
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ColumnDefault("true")
    private boolean active;

    @JsonBackReference(value = "ref-curricula")
    @ManyToMany(mappedBy = "skills")
    private Set<Curriculum> curricula;

    @JsonBackReference(value = "ref-focuses")
    @ManyToMany(mappedBy = "skills")
    private Set<Focus> focuses;

    @JsonBackReference(value = "ref-trainers")
    @ManyToMany(mappedBy = "skills")
    private Set<Trainer> trainers;

    @JsonBackReference(value = "ref-batches")
    @ManyToMany(mappedBy = "skills")
    private Set<Batch> batches;
}
