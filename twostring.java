public class twostring {
    public static void main(String[] args){
        String str1 = "Hello";
        String str2 = "Hello";

        //print length using stringbuffer
        StringBuffer sb = new StringBuffer(str1);
        int length = sb.length();
        System.out.println("Length of str1: " + length);
        
        // delete char using StringBuilder
        StringBuilder sb3 = new StringBuilder(str1);
        sb3.delete(0, 5);
        String deletedString = sb3.toString();
        System.out.println("Deleted String: " + deletedString);
        
        // replace text using StringBuilder
        StringBuilder sb1 = new StringBuilder(str1);
        sb1.replace(0, 5, "Hi");
        String replacedString = sb1.toString();
        System.out.println("Replaced String: " + replacedString);

        // insert text using StringBuilder
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.insert(0, "Welcome ");;
        String insertedString = sb2.toString();
        System.out.println("Inserted String: " + insertedString);
        
        // append text using StringBuilder
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str1);
        sb4.append(" ");
        sb4.append(str2);
        String appendedString = sb4.toString();
        System.out.println("Appended String: " + appendedString);

        // palindrome in string
        String cleanedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedStr1 = new StringBuilder(cleanedStr1).reverse().toString();  
        String reversedStr2 = new StringBuilder(cleanedStr2).reverse().toString();

        if (cleanedStr1.equals(reversedStr1)) {
            System.out.println("str1 is a palindrome.");
        } else {
            System.out.println("str1 is not a palindrome.");
        }
        if (cleanedStr2.equals(reversedStr2)) {
            System.out.println("str2 is a palindrome.");
        } else {
            System.out.println("str2 is not a palindrome.");
        }

        // vowels in string
        int vowelCount1 = 0;
        int vowelCount2 = 0;
        for (char c : str1.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount1++;
            }
        }
        for (char c : str2.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount2++;
            }
        }
        // trim the string
        String trimmedStr1 = str1.trim();
        String trimmedStr2 = str2.trim();
        System.out.println("Trimmed str1: " + trimmedStr1);
        System.out.println("Trimmed str2: " + trimmedStr2);
        System.out.println("Vowel count in str1: " + vowelCount1);
        System.out.println("Vowel count in str2: " + vowelCount2);

        // reverse a string
        String reversedPlain1 = new StringBuilder(str1).reverse().toString();
        String reversedPlain2 = new StringBuilder(str2).reverse().toString();
        System.out.println("Reversed str1: " + reversedPlain1);
        System.out.println("Reversed str2: " + reversedPlain2);

        // concatenate two strings
        String concat = str1.concat(str2);
        System.out.println("Concatenated string: " + concat);

        // convert the given string using + operator
        String concatnatedStrPlus = str1 + " " + str2;
        System.out.println("Concatenated string using + operator: " + concatnatedStrPlus);

        // extract substring from the given string
        String Substring1 = str1.substring(0, 3); 
        String Substring2 = str2.substring(0, 3);
        System.out.println("Substring of str1: " + Substring1);
        System.out.println("Substring of str2: " + Substring2);

        // check if string contains word for string str1.
        if(str1.contains("Hello")){
            System.out.println("str1 contains 'Hello'");
        } else {
            System.out.println("str1 does not contain 'Hello'");
        }

        // convert string to uppercase
        String upper1 = str1.toUpperCase();
        System.out.println("Uppercase of str1: " + upper1);

        // convert string to lowercase
        String lower1 = str1.toLowerCase();
        System.out.println("Lowercase of str1: " + lower1);
        System.out.println("Original str1: " + str1);

        // length of a string
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        if(str1.equals(str2)){
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
        if (str1 == str2){
            System.out.println("The string references are same.");
        } else {
            System.out.println("The string references are not same.");
        }
    }
}