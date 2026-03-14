import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int a[] ={1,3,4,7,8,9,11,13,14,15};
        int b[]={2,5,6,10,12};
        int c[]=new int[a.length+b.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j< b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while (j<b.length) {
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
    }
}
