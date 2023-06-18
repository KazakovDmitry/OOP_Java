package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private  double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    // private Vacancy vacancy;

    public void needEmployee(Vacancy vacancy){
        // double salary = random.nextDouble(2500, 150000);
        jobAgency.sendOffer(nameCompany, vacancy.getSalary(), vacancy);
    }

}
