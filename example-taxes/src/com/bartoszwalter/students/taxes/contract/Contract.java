package com.bartoszwalter.students.taxes.contract;

public interface Contract {
    void setSalaryPerMonthGross(double salaryGross);
    double calculateNettoSalary();
}
