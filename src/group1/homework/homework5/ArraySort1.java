package group1.homework.homework5;

public class ArraySort1 {
    public static void main(String[] args) {
        int[] a = {43, 55, 5, -9, 0, 12, 5, 65};
        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);
        for (int x : a) {
            System.out.print(x + ";");

        }
        System.out.println();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;

            }

        }
        for (int x : a) {
            System.out.print(x + ":");

        }
    }

}




