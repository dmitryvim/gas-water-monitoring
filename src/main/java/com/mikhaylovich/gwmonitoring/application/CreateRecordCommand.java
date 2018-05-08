package com.mikhaylovich.gwmonitoring.application;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
public class CreateRecordCommand {
    private double gas;

    private double hotWater;

    private double coldWater;

    private int userId;


    public CreateRecordCommand(double gas, double hotWater, double coldWater, int userId) {
        this.gas = gas;
        this.hotWater = hotWater;
        this.coldWater = coldWater;
        this.userId = userId;
    }

    public double getGas() {
        return gas;
    }

    public double getHotWater() {
        return hotWater;
    }

    public double getColdWater() {
        return coldWater;
    }

    public int getUserId() {
        return userId;
    }
}
