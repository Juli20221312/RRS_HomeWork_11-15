package HW_11.Employee_HW10;

public class Main {
    public static void main(String[] args) {
//        Manager manager1 = new Manager();
//        manager1.setName("Tim");
//        manager1.setBaseSalary(1500.0);
//        manager1.setNumberOfSubordinates(7);
//
//        Manager manager2 = new Manager();
//        manager2.setName("Tom");
//        manager2.setBaseSalary(1200.0);
//        manager2.setNumberOfSubordinates(15);
//
//
//        WorkerUtils workerUtils = new WorkerUtils();
//        Manager result = workerUtils.findMinBonus(new Manager[]{manager1, manager2});
//        System.out.println(result.getName());

        Manager manager1 = new Manager();
        manager1.setName("Tim");
        manager1.setBaseSalary(1500.0);
        manager1.setNumberOfSubordinates(7);

        Manager manager2 = new Manager();
        manager2.setName("Tom");
        manager2.setBaseSalary(1200.0);
        manager2.setNumberOfSubordinates(10);

        WorkerUtils workerUtils = new WorkerUtils();
        Manager result = workerUtils.findMinBonus(new Manager[]{manager1, manager2});
        System.out.println(result.getName());
    }
}
