package com.revature.hydraaggregatorservice.model.skill;

import javax.persistence.*;

import com.revature.hydraaggregatorservice.model.curriculum.Curriculum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ColumnDefault("true")
    private boolean active;

    @ManyToMany(mappedBy = "skills")
    private Set<Curriculum> curricula;
}
