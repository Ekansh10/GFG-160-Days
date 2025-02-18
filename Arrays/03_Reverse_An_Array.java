class Solution {
    public void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];
            
            i++;
            j--;
            
        }
    }
}