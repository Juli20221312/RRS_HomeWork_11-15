package HW_12;

// https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
public class Codewars_4 {
    public static String position(char alphabet) {
        String line = "abcdefghijklmnopqrstuvwxyz";
        int index = line.indexOf(alphabet) + 1;

        return "Position of alphabet: " + Integer.toString(index);
    }



    public static void main(String[] args) {
        System.out.println(position('a'));
    }
}
