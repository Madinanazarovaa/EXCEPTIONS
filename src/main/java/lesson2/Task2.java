package lesson2;

public class Task2 {
    public static void task2() {
        try {
            int d = 1;
            int[] intArray = new int[10];
            if(d != 0){
                double catchedRes1 = (double) intArray[8] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
