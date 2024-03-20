package HW_12;

//Задача №1
//
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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1 {
    public static void task_1(String[] args) {

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
    }
}




//Задача №2
//
//Создать лист со значениями от 100 до 1000.
//
//
//Задача №3
//
//Удалить из листа, созданного в предыдущей задаче, все четные элементы.
//
//
//Задача со звездочкой
//Создать список из 30 или более случайных слов (например, можно воспользоваться https://randomwordgenerator.com/ ).
//Напечатать из этого списка самые длинные слова, начинающиеся на каждую букву. Т.е. если, к примеру, в списке есть слова,
// начинающиеся на a, b, d, f, то надо напечатать самое длинное слово на a, самое длинное на b, на d и нa f.