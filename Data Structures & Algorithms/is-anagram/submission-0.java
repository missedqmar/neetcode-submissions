class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        ArrayList<Character> tChars = new ArrayList<>();
        for(char c : t.toCharArray()){
            tChars.add(c);
        }

        if(sChars.length != tChars.size()){
            return false;
        }

        for(int i=0; i< sChars.length; i++)
        {
            for(int j=0; j< tChars.size(); j++)
            {
                if(sChars[i] == tChars.get(j))
                {
                    tChars.remove(j);
                    break;
                }
            }
        }
        if(tChars.isEmpty()){
            return true;
        }
        return false;
    }
}
