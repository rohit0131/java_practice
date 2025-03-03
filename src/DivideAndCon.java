import java.util.Scanner;
public class DivideAndCon {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int No=sc.nextInt();
       int [] arr={3,5,6,8,10,20,24,26};
       int mid= arr.length/2;

           if(mid>No){
               for(int i=0;i<mid;i++){
                   if(No==arr[i]){
                       System.out.println(arr[i]);
                   }
               }
           }
           else if(mid<No){
               for(int i=0;i<mid;i++){
                   if(No==arr[i]){
                       System.out.println(arr[i]);
                   }
               }
           }
           else{
               System.out.println(mid);
           }

    }
}
