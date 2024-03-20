package HW_11.Employee_HW10;



public class WorkerUtils {
    public Employee findEmployeeByName(Employee[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (name.equals(array[i].getName())) {
                return array[i];
            }
        }
        return null;
    }
//●	поиск сотрудника в массиве по вхождению указанной строки в его имени

    public Employee findEmployeeBySubName(Employee[] array, String subName) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getName().contains(subName)) {
                return array[i];
            }
        }
        return null;
    }

    //●	подсчет зарплатного бюджета для всех сотрудников в массиве
    public double findAllSalary(Employee[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i].getSalary();
        }
        return sum;
    }

    //●	поиск наименьшей зарплаты в массиве
    public Employee findMinSalary(Employee[] array) {
        Employee result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() < result.getSalary()) {
                result = array[i];
            }
        }
        return result;
    }


    //●	поиск наибольшей зарплаты в массиве
    public Employee findMaxSalary(Employee[] array) {
        Employee result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getSalary() > result.getSalary()) {
                result = array[i];
            }
        }
        return result;
    }

    //●	поиск наименьшего количества подчиненных в массиве менеджеров
    public Manager findMinNumberOfSubordinates(Manager[] array) {
        Manager result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates() < result.getNumberOfSubordinates()) {
                result = array[i];
            }
        }
        return result;
    }

    //●	поиск наибольшего количества подчиненных в массиве менеджеров
    public Manager findMaxNumberOfSubordinates(Manager[] array) {
        Manager result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getNumberOfSubordinates() > result.getNumberOfSubordinates()) {
                result = array[i];
            }
        }
        return result;
    }

    //●	поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public Manager findMaxBonus(Manager[] array) {
        Manager result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getBaseSalary() - array[i].getSalary() > result.getBaseSalary() - result.getSalary()) {
                result = array[i];
            }
        }
        return result;
    }


    //●	поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
    public Manager findMinBonus(Manager[] array) {
        Manager result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].getBaseSalary() - array[i].getSalary() < result.getBaseSalary() - result.getSalary()) { //не знаю как указать, что надо выбирать метод getBaseSalary из класса Manager, а не Employee
                result = array[i];
            }
        }
        return result;
    }
}

