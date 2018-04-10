package com.revature.hydraaggregatorservice.model.settings;

import com.revature.hydraaggregatorservice.model.location.Building;
import com.revature.hydraaggregatorservice.model.location.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room defaultLocation;

    @OneToOne
    @JoinColumn(name = "building_id")
    private Building defaultBuilding;

    private String defaultNamePattern;
}
