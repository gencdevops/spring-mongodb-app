package com.example.springmongodbapp.data.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sensorsDB")
public class Sensor { // POJO = Document
    public String name;
    public double data;
    public String host;
    public int port;


}
