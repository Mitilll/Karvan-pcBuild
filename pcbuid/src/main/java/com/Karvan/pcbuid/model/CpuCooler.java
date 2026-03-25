package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "CpuCooler")
public class CpuCooler {

    @Id
    private String CpuCoolerId;

    private String name;

    private int rpm;

    private double noise_level;

    private boolean rgb;

    private String image;

    private double priceRs;


}
