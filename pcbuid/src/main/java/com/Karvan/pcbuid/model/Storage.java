package com.Karvan.pcbuid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Storage")
public class Storage {

    @Id
    private String storageId;

    private String name;

    private int capacity;

    private String type;

    private int cache;

    private String form_factor;

    private String interfase;

    private String image;

    private double priceRs;
}
