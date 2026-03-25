package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "MotherBoard")
public class MotherBoard {

    @Id
    private String motherId;

    private String name;

    private String socket;

    private int form_factor;

    private double priceRs;

    private String image;

    private int memory_slots;

}
