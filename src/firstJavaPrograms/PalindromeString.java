package firstJavaPrograms;

import java.util.Scanner;

public class PalindromeString {
    static void main() {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();
        System.out.println(isPallindrome(s));
        scan.close();
    }

    static boolean isPallindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }


        return true;
    }}
//        String result="";
//        // ababa
//        for (int i=str.length()-1; i>=0; i--)
//        {
//             result = result+str.charAt(i);
//        }
//        if (result.equalsIgnoreCase(str))
//        {
//            return true;
//        }
//
//        return false;

