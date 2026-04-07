package com.Karvan.pcbuid.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashMap;
import java.util.Map;

@Data
@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;

    private String nome;
    private String marca;
    private String categoria;

    private Double preco;
    private String imagem;

    private String mercadoLivreId;

    private Map<String, String> atributos = new HashMap<>();
}
