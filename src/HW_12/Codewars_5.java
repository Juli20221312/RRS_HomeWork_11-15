package HW_12;

//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
public class Codewars_5 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }

//        int sum = 0;
//        for (int i = 0; i < arr1.length; i++) {               //не сработает, если длина массивов разная
//            sum += arr1[i] + arr2[i];
//        }
            return sum;


    }

    public static void testArrayPlusArray(){
        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6})==21);
        System.out.println(arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6})==-21);

    }




    public static void main(String[] args) {
//        System.out.println(arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
//        System.out.println(arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6}));
//        System.out.println(arrayPlusArray(new int[]{-1,-2,-3}, new int[]{-4,-5,-6, -7}));
        testArrayPlusArray();
    }


}