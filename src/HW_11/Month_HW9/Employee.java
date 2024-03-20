package HW_11.Month_HW9;
//Задача №2
//
//        Необходимо реализовать задание из Tasks#9 со следующими условиями:
//        ●	Класс Month сделать неизменяемым (immutable)
//        ●	Статические поля с объектами месяцев должны быть финальными
//        ●	Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
//        ●	Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//        ●	Классы Employee и Manager должны быть финальными

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double daySalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public double getSalary(Month[] monthArray) {
        double sum = 0;

        for (int i = 0; i < monthArray.length; i++) {
            sum = sum +monthArray[i].getAmountWorkDays()* daySalary;
        }
        return sum;
    }
}
