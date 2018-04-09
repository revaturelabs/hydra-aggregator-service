package com.revature.hydraaggregatorservice.model.batch;

import javax.persistence.*;

import com.revature.hydraaggregatorservice.model.curriculum.Curriculum;
import com.revature.hydraaggregatorservice.model.skill.Skill;
import com.revature.hydraaggregatorservice.model.trainers.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp startDate;
    private Timestamp endDate;

    @OneToOne
    @JoinColumn(name = "curriculum_id")
    private Curriculum curriculum;

    @OneToOne
    @JoinColumn(name = "focus_id")
    private Curriculum focus;

    @OneToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @OneToOne
    @JoinColumn(name = "co_trainer_id")
    private Trainer coTrainer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
        name = "batch_skill",
        joinColumns = @JoinColumn(name = "batch_id"),
        inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Skill> skills;

    @OneToOne
    @JoinColumn(name = "batch_status_id")
    private BatchStatus batchStatus;

    @OneToOne
    @JoinColumn(name = "batch_location_id")
    private BatchLocation batchLocation;
}