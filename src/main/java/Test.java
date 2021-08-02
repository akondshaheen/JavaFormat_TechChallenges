public class Test {

    public void test(String s1, String s2, String s3, int x, int y, int z) {

        if (s1.length() <= 10 && x >= 0 && x <= 999) {
            System.out.printf("%-15s%03d%n", s1, x);
            System.out.printf("%-15s%03d%n", s2, y);
            System.out.printf("%-15s%03d%n", s3, z);
        } else {
            System.out.println("Number is unrecognized!");
        }
    }
}

