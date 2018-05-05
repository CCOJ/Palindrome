public class Driver {
    public static void main(String[] args) {
        //Not a real palindrome
        Palindrome abc = new Palindrome("abc");
        System.out.println(abc.getEverything());

        //Odd length palindrome
        Palindrome aba = new Palindrome("aba");
        System.out.println(aba.getEverything());

        //Even length palindrome
        Palindrome abba = new Palindrome("abba");
        System.out.println(abba.getEverything());

        //Odd case palindrome
        Palindrome empty = new Palindrome("");
        System.out.println(empty.getEverything());

        //Replace the input string with desired input
        String input = "1234321";
        Palindrome test = new Palindrome(input);
        System.out.println(test.getEverything());
    }
}
