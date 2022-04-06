import java.util.ArrayList;

public class PrimeNumber {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    private static void primePrint(int startRange, int endRange) {
        System.out.println("Prime numbers are in between " + startRange + " and " + endRange + " are :");
        for (int range = startRange; range <= endRange; range++) {
            if (isPrime(range)) {
                arrayList.add(range);
            }
        }
        System.out.println(arrayList);
    }

    public static boolean isPrime(int num) {
        int flag = 0;
        if (num == 0 || num == 1)
            return false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int startRange = 0;
        int endRange =1000;
        primePrint(startRange, endRange);
    }

}
