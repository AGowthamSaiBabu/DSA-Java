public class BinarySearch {
    public static void main(String[] args) {
        int arr [] ={10,20,30,44,56,77};
        
        int target=56;
        int Low =0;
        int high =arr.length-1;

        while(Low<=high){
            int mid =(Low+high)/2;

            if(arr[mid] == target){
                System.out.println("Element Found at index : "+mid);
                return;
            }
            else if(arr[mid]<target){
                Low = mid +1;
            }else {
                high =mid -1;
            }
        }
        System.out.println("Element Not Found");
    }
}
