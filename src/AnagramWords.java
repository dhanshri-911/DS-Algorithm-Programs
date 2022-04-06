import java.util.Arrays;
import java.util.Scanner;

public class AnagramWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the second Word");
        String str1 = sc.nextLine();
        String str2 = sc1.nextLine();
        //lower case
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        //cheak length
        if(str1.length() == str2.length()){
            //convert string into char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            //if sorted array is same string is anagram
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            boolean result = Arrays.equals(charArray1,charArray2);
            if(result){
                System.out.println(str1 + "  and  " +str2 + " are anagram");
            }else {
                System.out.println(str1 + "   and  " + str2 + "  not anagram");
            }
        }else{
            System.out.println("invalid word");
        }

    }
}
