class Solution {
    public boolean isPalindrome(String s) {
        String trimmedString = s.replaceAll("[^A-Za-z0-9]", "");
        char[] chars = trimmedString.toLowerCase().toCharArray();

        int halfway = trimmedString.length()/2;
        if(trimmedString.length() == 1){
            return true;
        }

        int walker = 0;
        int reverseWalker = trimmedString.length()-1;

        for(int i=0; i<halfway; i++){
            if(chars[walker] != chars[reverseWalker]){
                return false;
            }
            walker++;
            reverseWalker--;
        }

        return true;

    }
}
