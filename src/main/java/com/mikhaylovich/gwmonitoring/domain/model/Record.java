package com.mikhaylovich.gwmonitoring.domain.model;

import org.springframework.util.Assert;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
//TODO add no args constructor
public class Record {

    private Gas gas;

    private Water coldWater;

    private Water hotWater;

    private User user;

    public Record(Gas gas, Water coldWater, Water hotWater, User user) {
        Assert.notNull(gas, "The gas counter is required.");
        this.gas = gas;
        Assert.notNull(coldWater, "The cold water counter is required.");
        this.coldWater = coldWater;
        Assert.notNull(hotWater, "The hot water counter is required.");
        this.hotWater = hotWater;
        Assert.notNull(user, "The user is required.");
        this.user = user;
    }

    public Gas getGas() {
        return gas;
    }

    public Water getColdWater() {
        return coldWater;
    }

    public Water getHotWater() {
        return hotWater;
    }

    public boolean allCountersNotLessThan(Record previous) {
        return this.user.equals(previous.user) &&
                this.gas.getValue() >= previous.gas.getValue() &&
                this.coldWater.getValue() >= previous.coldWater.getValue() &&
                this.hotWater.getValue() >= previous.hotWater.getValue();

    }
}
