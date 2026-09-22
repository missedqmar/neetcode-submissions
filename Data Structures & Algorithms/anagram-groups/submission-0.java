class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str: strs){
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);
            String key = new String(sortedStr);

            if(map.containsKey(key)){
                map.get(key).add(str);
            } else{
                map.put(key, new ArrayList<>());
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}