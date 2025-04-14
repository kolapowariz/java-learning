package com.kolapowariz;

// OOP
// Encapsulation - Bundle the data and methods that operate on the data in a single unit.
// Abstraction - reduce complexity by hiding unnecessary details
// Coupling - level of dependency between classes

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return getBaseSalary() + (getHourlyRate() * extraHours);
    }

    public void setBaseSalary(int baseSalary)  {
        if (baseSalary <= 0) throw new IllegalArgumentException("Base rate cannot be 0 or negative");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }
}
