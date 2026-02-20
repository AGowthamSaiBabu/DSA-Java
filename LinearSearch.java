public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {12,34,56,77,88,99};

        int target =100;
        int found =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found :"+i);
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("Element not found ");
        }
    }
}

//2
// public class LinearSearch {
//     public static void main(String[] args) {
//         int arr []= {22,44,55,66,77,88};

//         int target =55;
//         int count =0;

//         for(int i=0;i<arr.length;i++){
//               count++;
//             if(arr[i]==target){
//                 break;
//             }
//         }
//         System.out.println(count);
//     }
// }