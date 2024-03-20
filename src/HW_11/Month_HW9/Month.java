package HW_11.Month_HW9;

public class Month {
    private String monthName;
    private int amountDays;
    private int amountWorkDays;

    public Month(String monthName, int amountDays, int amountWorkDays) {
        this.monthName = monthName;
        this.amountDays = amountDays;
        this.amountWorkDays = amountWorkDays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getAmountDays() {
        return amountDays;
    }

    public int getAmountWorkDays() {
        return amountWorkDays;
    }
}
