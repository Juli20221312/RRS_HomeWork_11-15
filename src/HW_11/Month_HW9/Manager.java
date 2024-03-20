package HW_11.Month_HW9;

public class Manager {
    private String name;
    private int age;
    private char sex;
    private double daySalary;
    private int amountSub;

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

    public int getAmountSub() {
        return amountSub;
    }

    public void setAmountSub(int amountSub) {
        this.amountSub = amountSub;
    }


    public double getSalary(Month[] monthArray) {
        double sum = 0;

        for (int i = 0; i < monthArray.length; i++) {
            sum = sum + monthArray[i].getAmountWorkDays()* daySalary;
        }
        return sum*(1+0.01*amountSub);
    }
}
