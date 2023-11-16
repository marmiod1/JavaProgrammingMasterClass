package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge(){
        LocalDate curDate = LocalDate.now();

        return Period.between(LocalDate.parse(birthDate), curDate).getYears();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
