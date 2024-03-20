package HW_12;
// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

public class Codewars_1 {

    public static String abbrevName(String name) {
//        String[] names = name.split(" "); //разделитель строки на две подстроки по пробелу
//        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);


    }



    public static void main(String[] args) {
        // Test the function
        System.out.println(abbrevName("John Smith"));
        System.out.println(abbrevName("Иван Иванов"));
    }
}