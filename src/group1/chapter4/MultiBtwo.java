package group1.chapter4;

public class MultiBtwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }

    }
}