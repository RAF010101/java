package group1.chapter7.factorial2;

public class Recursion2 {
    public static void main(String[] args) {
      RecTest ob = new RecTest(10);
        for (int i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printarray(10);

    }
}
