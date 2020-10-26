//Verified
//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
public class ValidPalandromeSolution {
    public boolean isPalindrome(String s) {
        String invalidChars = "!@#$%^&*(){}[].,/?;:-+=`_ \"\'";
        String str = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(invalidChars.contains(Character.toString(c))) continue;

            str += c;
        }
        str = str.toLowerCase();
        System.out.println(str);

        int end = str.length() - 1;
        for(int begin = 0; begin < str.length(); begin++) {
            if(str.charAt(begin) != str.charAt(end)) {
                return false;
            } else {
                end--;
            }
        }

        return true;
    }
}
