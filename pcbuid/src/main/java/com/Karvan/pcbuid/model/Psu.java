package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Psu")
public class Psu {

    @Id
    private String psuId;

    private String name;

    private String type;

    private String efficiency;

    private int wattage;

    private String modular;

    private String image;

    private double priceRs;
}
