package com.bartoszwalter.students.taxes.provision;

public interface Provision {
    void calculateProvisions(double salaryGross);
    double subtractProvisionsFromBase(double base);
}
