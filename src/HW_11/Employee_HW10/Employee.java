package HW_11.Employee_HW10;
//Задача №1
//
//Необходимо реализовать задание из Task#10 со следующими условиями:
//●	Employee.getSalary должен быть абстрактный
//●	Worker.getBaseSalary должен быть финальным
//●	Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
//●	Классы Manager и Director должны быть финальными
public abstract class Employee {
    private double baseSalary;
    private String name;

    // private double salary; в разборе домашки не делали это поле

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract double getSalary();

    private int numberOfSubordinates;

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

}
