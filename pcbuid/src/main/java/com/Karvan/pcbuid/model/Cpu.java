package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Cpu")
public class Cpu {

    @Id
    private Long cpuId;

    private String name;

    private int core_count;

    private double core_clock;

    private int tdp;

    private String graphics;

    private String image;

    private double priceRs;

    private boolean forPc;

}
