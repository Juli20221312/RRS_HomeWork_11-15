package HW_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    //Задача №1
//Создать лист и добавить в него следующие слова:
//●	White.
//●	Tan.
//●	Yellow.
//●	Orange.
//●	Red.
//●	Pink.
//●	Purple.
//●	Blue.
//Затем удалить из этого списка все цвета в которых встречается буква “L”
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("White.");
        myList.add("Tan.");
        myList.add("Yellow.");
        myList.add("Orange.");
        myList.add("Red.");
        myList.add("Pink.");
        myList.add("Purple.");
        myList.add("Blue.");

        System.out.println(myList);

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.toLowerCase().contains("l")) {
                iterator.remove();
            }
        }
        System.out.println(myList);

//Задача №2
//Создать лист со значениями от 100 до 1000.

        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            numbers.add(i);
        }

        System.out.println("Список чисел от 100 до 1000:");
        System.out.println(numbers);
//Задача №3
//Удалить из листа, созданного в предыдущей задаче, все четные элементы.

        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }

        numbers.clear();
        numbers.addAll(oddNumbers);

        System.out.println(numbers);

    }
}
