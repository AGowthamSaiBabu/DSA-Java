public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        
        for(int i=1;i<arr.length;i++){
            int currentElement =arr[i];
            int j =i-1;

            while(j>=0 && arr[j]>=currentElement){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=currentElement;
        }
        for(int num :arr){
            System.out.print(num + " ");
        }
    }
}
