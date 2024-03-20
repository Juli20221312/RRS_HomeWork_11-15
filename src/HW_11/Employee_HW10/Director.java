package HW_11.Employee_HW10;

public final class Director extends Worker {

    public final static int indexDirector = 9;
    @Override
    public double getSalary() {

        if (getNumberOfSubordinates() == 0) {
            return super.getBaseSalary();
        } else {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * indexDirector);
        }
    }
}

