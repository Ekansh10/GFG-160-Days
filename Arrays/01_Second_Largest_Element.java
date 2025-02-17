class Solution {
    public int getSecondLargest(int[] arr) {
        int second = Integer.MIN_VALUE;
        int maxEle = arr[0];
        int len = arr.length;
        
        for(int i = 1; i < len; i++){
            if(arr[i] > maxEle){
                second = maxEle;
                maxEle = arr[i];
            }
            else{
                if(arr[i] != maxEle && arr[i] > second){
                    second = arr[i];
                }
            }
            
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        return second;
    }
}
