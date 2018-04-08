package com.revature.hydraaggregatorservice.model.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AssignforceSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String alias;
    private Integer trainersPerPage;
    private Integer reportGrads;
    private Integer batchLength;
    private Integer reportIncomingGrads;
    private Integer minBatchSize;
    private Integer maxBatchSize;
    private Integer trainerBreakDays;
    private Integer defaultLocation;
    private Integer defaultBuilding;
    private String defaultNamePattern;
}
