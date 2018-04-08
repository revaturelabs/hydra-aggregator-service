package com.revature.hydraaggregatorservice.model.unavailable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.revature.hydraaggregatorservice.model.location.Room;
import com.revature.hydraaggregatorservice.model.trainers.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Unavailable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Timestamp startDate;
    private Timestamp endDate;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;
}
