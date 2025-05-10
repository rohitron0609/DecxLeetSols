class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int bedSize = flowerbed.length;
        for(int i = 0; i < bedSize; i++){
            if(flowerbed[i] == 1)
                continue;
            if(i > 0 && i < bedSize-1){
                if(flowerbed[i-1] == 0 && flowerbed[i+1] ==0){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            else if(i == 0 && (bedSize == 1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
            else if(i == bedSize - 1 && flowerbed[i-1] == 0){
                flowerbed[i] = 1;
                n--;
            }
        }
        return n > 0? false : true;
    }
}