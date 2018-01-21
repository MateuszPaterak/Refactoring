package com.bartoszwalter.students.taxes.contract;

import com.bartoszwalter.students.taxes.provision.HealthProvision;
import com.bartoszwalter.students.taxes.provision.LaborTaxProvision;
import com.bartoszwalter.students.taxes.provision.SocialProvision;

public class PernamentContract implements Contract {
    private double salaryGross;
    private LaborTaxProvision laborTaxProvision;
    private SocialProvision socialProvision;
    private HealthProvision healthProvision;

    public PernamentContract(LaborTaxProvision laborTaxProvision, SocialProvision socialProvision, HealthProvision healthProvision) {
        this.laborTaxProvision = laborTaxProvision;
        this.socialProvision = socialProvision;
        this.healthProvision = healthProvision;
    }

    @Override
    public void setSalaryPerMonthGross(double salaryGross) {
        this.salaryGross = salaryGross;
    }

    @Override
    public double calculateNettoSalary() {
        socialProvision.calculateProvisions(salaryGross);
        double base = socialProvision.subtractProvisionsFromBase(salaryGross);
        healthProvision.calculateProvisions(base);
        laborTaxProvision.calculateProvisions(base);
        return laborTaxProvision.subtractProvisionsFromBase(base);
    }
}
