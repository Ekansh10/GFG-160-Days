class Solution {
    static void rotateArr(int arr[], int d) {
        int len = arr.length;
        d %= len;
        
        reverse(arr, 0, d-1);
        reverse(arr, d, len-1);
        reverse(arr, 0, len-1);
        
    }
    
    static void reverse(int arr[], int start, int end){
        while(start < end){
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            
            start++;
            end--;
        }
    }
}