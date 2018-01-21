package com.bartoszwalter.students.taxes.provision;

public class LaborTaxProvision implements Provision {
    private final double TAX_TRESHOLD = 46.33;
    private final double incomeCost = 111.25;
    private double tax = 0.0;

    @Override
    public void calculateProvisions(double base) {
        base -= incomeCost;
        base = (long) base;
        tax = 0.18 * base;
        tax -= TAX_TRESHOLD;
    }

    @Override
    public double subtractProvisionsFromBase(double base) {
        return base - tax;
    }

    public double getTAX_TRESHOLD() {
        return TAX_TRESHOLD;
    }

    public double getIncomeCost() {
        return incomeCost;
    }

    public double getTax() {
        return tax;
    }
}
