package codeLean.io.JavaOop_18;

public class ArrayCalculator {
    public static int maxOfArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static double maxOfArray(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static double minOfArray(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[0] > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }
}
