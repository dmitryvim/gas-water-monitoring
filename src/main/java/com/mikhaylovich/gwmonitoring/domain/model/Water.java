package com.mikhaylovich.gwmonitoring.domain.model;

import org.springframework.util.Assert;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
public class Water {
    private double value;

    public Water(double value) {
        Assert.isTrue(value >= 0, "The water counter value must be positive or zero.");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
