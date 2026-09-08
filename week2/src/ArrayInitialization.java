public class ArrayInitialization {
    public static void main(String[] args) {
        double[] arr1 = {1.1, 2.3, 4.7, 7.5};
        double[] arr2 = new double[4];
        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;

        for (int i = 0; i < 4; i++)
        {
            System.out.printf("arr1 index %d : %.1f\n" +
                              "arr2 index %d : %.1f",
                              (i+1), arr1[i], (i+1), arr2[i]);

            if (i != 3) { System.out.print("\n\n"); }
        }
    }
}
