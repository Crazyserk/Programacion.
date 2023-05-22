package CAFETERA;

public class array1 {

    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {

            if (i % 2 == 0) {
                array[i] = 0;

            } else {
                array[i] = 1;

            }
        }

    }

}
