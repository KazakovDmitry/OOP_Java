package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Ingeneer implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    // private enum TypeSkill {Программист}
    // TypeSkill typeSkill;
 

    public Ingeneer(String name, TypeVacancy typeVacancy) {
        this.name = name;
        minSalary = random.nextDouble(50000, 80000);
    }


    @Override
    public void receiveOffer(String nameCompany, double salary) {
        if (minSalary <= salary) {
            System.out.printf("Инженер %s (%.2f) >>> Мне нужна эта работа! (%s - %.2f)\n",
                    name, minSalary, nameCompany, salary);
            minSalary = salary;
        }
        else {
            System.out.printf("Инженер %s (%.2f) >>> Я найду работу получше! (%s - %.2f)\n",
                    name, minSalary, nameCompany, salary);
        }
    }
    
}
