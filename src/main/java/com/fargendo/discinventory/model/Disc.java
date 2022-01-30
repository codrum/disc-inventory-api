package com.fargendo.discinventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Disc {

    private int id;

    private int brandId;

    private String mold;

    private int typeId;

    private String plastic;

    private int weight;

    private String color;

    private String stampColor;

    private double price;

    private String title;

    private String description;

    private String imageUrl;

    private int flatness;

    private int stiffness;

    private Boolean used;

    private int statusId;
}