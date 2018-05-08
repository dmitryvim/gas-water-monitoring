package com.mikhaylovich.gwmonitoring.domain.model;

import org.springframework.util.Assert;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
public class Gas {
    private double value;

    public Gas(double value) {
        Assert.isTrue(value >= 0, "The gas counter value must be positive or zero.");
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
