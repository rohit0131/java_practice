import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int arr2;
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr=new ArrayList<Integer>();

        arr1.add(4);
        arr1.add(2);arr1.add(6);arr1.add(7);
     int size =arr1.size();
        System.out.println(size);
        for(int i=0;i<size; i++){
              arr2 =arr1.get(i);
            System.out.print(arr2  +" ");

        }
        System.out.println(arr.size());

    }

}