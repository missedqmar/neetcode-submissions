class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        } else if(s.length()==0 && t.length()==0){
            return true;
        }

        char[] sCharArr = s.toCharArray();
        char[] tCharArr = t.toCharArray();

        Arrays.sort(sCharArr);
        Arrays.sort(tCharArr);

        for(int i=0; i<sCharArr.length; i++){
            if(sCharArr[i] != tCharArr[i]){
                return false;
            }
        }

        return true;
    }
}
