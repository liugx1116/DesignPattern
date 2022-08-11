package com.atgx.decorator;

import lombok.Data;

@Data
public abstract class Drink {

    public String des;
    private float price = 0.0f;
    public abstract float cost();
}
