
/**
 * This Palindrome class reverses a given input and finds the distance
 * in how close of a palindrome it is. It determines if the input
 * is a true palindrome.
 *
 * @author Randy Nguyen
 * May 4, 2018
 */
public class Palindrome {

    private String original, palindrome;

    /**
     * Takes in original string and reverses it
     *
     * @param original
     */
    public Palindrome(String original) {
        this.original = original;
        palindrome = reverse(original);
    }

    /**
     * Reverses the original string using StringBuilder
     *
     * @param original
     * @return
     */
    private String reverse(String original) {
        StringBuilder reverse = new StringBuilder();
        int length = original.length();

        for (int i = length - 1; i >= 0; i--) { //Appends to reverse string until null
            reverse.append(original.charAt(i));
        }

        return reverse.toString();
    }

    /**
     * Obtains distance in how close the palindrome is (a score)
     *
     * @return
     */
    public int getDistance() {
        int distance = 0;
        int length = original.length();
        int left = 0;
        char leftChar, rightChar;

        for (int right = length - 1; right >= length / 2; right--) { //Gets next rightChar
            leftChar = original.charAt(left);
            rightChar = original.charAt(right);

            if (leftChar == rightChar) { //If leftChar and rightChar matches, distance increments
                distance++;
            }

            left++; //Get next leftChar
        }
        return distance;
    }

    /**
     * Gets original
     *
     * @return
     */
    public String getOriginal() {
        return original;
    }

    /**
     * Gets both original and palindrome
     *
     * @return
     */
    public String getPalindrome() {
        return palindrome;
    }

    /**
     * Returns every info on the palindrome
     *
     * @return
     */
    public String getEverything() {
        return "Original: " + getOriginal()
                + "\nPalindrome: " + getPalindrome()
                + "\nDistance: " + getDistance()
                + "\nIs True Palindrome: " + isTruePalindrome()
                + "\n";
    }

    /**
     * Returns if the input is a true palindrome
     *
     * @return
     */
    public boolean isTruePalindrome() {
        if (getDistance() == (original.length() + 1) / 2)
            return true;
        else
            return false;
    }

    /**
     * Returns palindrome
     *
     * @return
     */
    public String toString() {
        return palindrome;
    }
}
