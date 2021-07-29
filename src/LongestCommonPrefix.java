public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";

        for(int i = 1; i < strs[0].length() + 1; i++) {// i is the index of substring 0,i in the first word
            String temp = strs[0].substring(0, i);
            boolean flag = true;

            for(int j = 0; j < strs.length; j++) { // j is the index in the list of words
                if(i > strs[j].length()){
                    flag = false;
                    continue;
                }
                if(!temp.equals(strs[j].substring(0,i))) {
                    flag = false;
                }
            }
            if(flag) {
                prefix = temp;
            }
        }

        return prefix;
    }
}
