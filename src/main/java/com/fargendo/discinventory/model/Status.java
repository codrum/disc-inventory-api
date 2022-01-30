package com.fargendo.discinventory.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
public class Status {

    private int id;

    private String description;
}