import java.util.Random;

public class Main {

    public Main() {
        // test solutions here
        TwoSumSolution sumSolution = new TwoSumSolution();

        Random r = new Random();

        int[] arr = new int[10000];
        // fill arr with dummy data
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        int target = 158;
        int[] result = sumSolution.twoSum(arr, target);
        System.out.println("{" + result[0] + ", " + result[1] + "}");
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        new Main();
        long endTime = System.currentTimeMillis();
        System.out.println("That took: " + (endTime - startTime) + " ms");
    }
}
