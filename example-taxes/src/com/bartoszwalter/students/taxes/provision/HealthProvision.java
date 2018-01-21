package com.bartoszwalter.students.taxes.provision;

public class HealthProvision implements Provision {
    private double healthInsuranceBase = 0;
    private double healthInsuranceExtra = 0;

    @Override
    public void calculateProvisions(double base) {
        healthInsuranceBase = base * 0.09;
        healthInsuranceExtra = base * 0.0775;
    }

    @Override
    public double subtractProvisionsFromBase(double base) {
        return base - healthInsuranceBase - healthInsuranceExtra;
    }

    public double getHealthInsuranceBase() {
        return healthInsuranceBase;
    }

    public double getHealthInsuranceExtra() {
        return healthInsuranceExtra;
    }
}
