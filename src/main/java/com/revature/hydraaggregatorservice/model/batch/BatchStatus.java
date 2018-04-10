package com.revature.hydraaggregatorservice.model.batch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BatchStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer batchStatusId;
    private String name;
}
