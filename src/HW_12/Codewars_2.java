package HW_12;
// https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
public class Codewars_2 {
    public static boolean feast(String beast, String dish) {

        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(feast("great blue heron", "garlic nann"));
        System.out.println(feast("brown bear", "bear claw"));
    }


}
