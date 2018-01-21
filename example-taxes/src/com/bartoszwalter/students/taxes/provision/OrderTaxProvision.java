package com.bartoszwalter.students.taxes.provision;

public class OrderTaxProvision implements Provision {
    private final double TAX_TRESHOLD = 46.33;
    private double incomeCost = 0.0;
    private double tax = 0.0;

    @Override
    public void calculateProvisions(double base) {
        incomeCost = base * 0.2;
        base -= incomeCost;
        base = (long) base;
        tax = 0.18 * base;
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
