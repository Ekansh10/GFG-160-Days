class Solution {
    void swap(int a, int b, int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    void pushZerosToEnd(int[] arr) {
        int c = 0;
        int len = arr.length;
        
        for(int i = 0; i < len; i++){
            if(arr[i] != 0){
                swap(i, c, arr);
                c++;
            }
        }
    }
}
