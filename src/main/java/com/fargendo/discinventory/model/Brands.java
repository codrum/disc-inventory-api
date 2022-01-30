package com.fargendo.discinventory.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Brands{

    private int id;

    private String name;

    private String description;
}