package com.Karvan.pcbuid.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pcs")
public class Pc {

    @Id
    private String id;

    private Produto cpu;
    private Produto gpu;
    private Produto ram;
    private Produto storage;
    private Produto motherboard;
    private Produto psu;

    private Double precoTotal;
}