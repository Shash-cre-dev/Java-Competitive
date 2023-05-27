import java.util.*;

class Main {
    public static boolean isPalindrome(int x) {
        int org = x;
        int rev = 0;
        while (x > 0) {
            rev <<= 1;
            rev |= (x & 1);
            x >>= 1;
        }
        System.out.println(rev);
        return rev == org;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println(a + " has a binary palindrome");
        } else {
            System.out.println("Failed");
        }
    }

}
