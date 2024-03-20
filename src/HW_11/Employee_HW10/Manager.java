package HW_11.Employee_HW10;
//●	Классы Manager и Director должны быть финальными
public final class Manager extends Worker {

    public final static int indexManager = 3;



    @Override
    public double getSalary() {

        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
            return super.getBaseSalary() * (getNumberOfSubordinates() / 100 * indexManager);
        }
    }
}
