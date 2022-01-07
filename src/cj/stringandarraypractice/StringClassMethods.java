package cj.stringandarraypractice;

public class StringClassMethods {
    public static void main(String[] args) {
        String str="i am learning at cyber success";
        String str1="I am learning at cyber success";

        //charAt() this method return char at index
        System.out.println(str.charAt(0));
        //codePointAt() this method retuns int of the Unicode of the character at the specified index
        System.out.println(str.codePointAt(1));
        //Returns the Unicode of the character before the specified index
        System.out.println(str.codePointBefore(1));
        //Returns the number of Unicode values found in a string
        System.out.println(str.codePointCount(0,3));
        //returns no. of characters in string including spaces
        System.out.println(str.length());
        //Compares two strings lexicographically
        System.out.println(str.compareTo(str1));
        //Compares two strings lexicographically, ignoring case differences
        System.out.println(str.equalsIgnoreCase(str1));
        //Compares two strings lexicographically, ignoring case differences
        System.out.println(str.concat(" robust"));
        System.out.println(str);

        //Checks whether a string contains a sequence of characters
        System.out.println(str.contains((str1)));

        //Returns a String that represents the characters of the character array
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
        System.out.println("Returned String: " + myStr2);


    }
}
