package com.Karvan.pcbuid.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "VideoCard")
public class VideoCard {

    @Id
    private String gpuId;

    private String name;

    private String chipset;

    private int memory;

    private int core_clock;

    private int boost_clock;

    private String image;

    private double priceRs;






}



