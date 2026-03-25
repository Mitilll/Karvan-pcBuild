package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Ram")
public class Ram {

    @Id
    private String ramId;

    private String name;

    private int speed;

    private int modules;

    private String image;

    private double priceRs;
}
