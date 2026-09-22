class Solution {
    public int hammingWeight(int n) {
        int movingBit = 0x1;
        int counter = 0;
        for(int i = 0; i< 32; i++){
            if((movingBit & n) > 0){
               counter++; 
            }
            movingBit <<= 1;
        }
        return counter;
    }
}
