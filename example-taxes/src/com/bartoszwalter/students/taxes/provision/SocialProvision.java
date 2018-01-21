package com.bartoszwalter.students.taxes.provision;

public class SocialProvision implements Provision {
    private double pensionableBase = 0;
    private double annuitiesBase = 0;
    private double healthInsuranceBase = 0;

    @Override
    public void calculateProvisions(double salaryGross) {
        pensionableBase = salaryGross * 0.0976;
        annuitiesBase = salaryGross * 0.015;
        healthInsuranceBase = salaryGross * 0.0245;
    }

    @Override
    public double subtractProvisionsFromBase(double base) {
        return base - pensionableBase - annuitiesBase - healthInsuranceBase;
    }

    public double getPensionableBase() {
        return pensionableBase;
    }

    public double getAnnuitiesBase() {
        return annuitiesBase;
    }

    public double getHealthInsuranceBase() {
        return healthInsuranceBase;
    }
}
