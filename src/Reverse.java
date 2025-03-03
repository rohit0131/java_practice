import java.util.Scanner;
public class Reverse{
    public static void main(String [] args){
       Scanner sc =new Scanner(System.in);
       String str=sc.nextLine();
       System.out.println(str);
       int len= str.length();

      for(int i=len-1;i>=0;i--){
          System.out.print(str.charAt(i));
      }
    }
}
