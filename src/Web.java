public class Web{
    public static void perfectName(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }if(sum==num){
            System.out.println(num+" is a perfect Number");
        }else{
            System.out.println(num+" is not a perfect Number");
        }
    }

    public static void rangebetweenperfectNo(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum) {
            System.out.print(sum + ",");
        }

    }
    public static void primeNumber(int num){
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(num+" Is a prime number");
        }else {
            System.out.println(num+" Is not a prime number");
        }
    }

    public static void printVowelsAConsonant(String str){
        String vowels="",consonants="";
        str=str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++){
            char ch=str.charAt(i);
            if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels=vowels+ch;
                }else{
                    consonants=consonants+ch;
                }
            }
        }
        System.out.println("Vowels are in the string "+vowels);
        System.out.println("Consonants are int the string "+consonants);

    }

    public static void reverseNumber(int num){
        int rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        System.out.println(sum);


    }
    public static void reverseString(String str){
        // Reverse String using Array  first i convert the string into arr Using toCharArray method then use reverse for

        char ch[]=str.toCharArray();
        for(int i= ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
    public static void fibonacciSeries(int num){
        int a=0,b=1,c=0;
        System.out.print(a+","+b+",");
        for(int i=2;i<10;i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
    public static void palindromeInteger(int num){
        int rem,sum=0;
        int temp=num;
        while(num>0){
            rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("The given number is Palindrome");
        }else{
            System.out.println("The given number is not Palindrome");
        }
    }

    public static void palindromeString(String str){
        char ch[]=str.toCharArray();
        String storeString="";

        for(int i=ch.length-1;i>=0;i--){
            storeString=storeString+ch[i];

        }if(storeString.equals(str)){
            System.out.println("The given string is a palindrome");
        }else{
            System.out.println("The given string is not a palindrome");
        }
    }

    public static void swapTwoNumberUsingThirdVeriable(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a "+a+" value of b "+b);
    }
    public static void swapTwoNumberWithoutUsingThirdVeriable(int a,int b){
        a=a+b; //10+20=30
        b=a-b; //30-20; 10
        a=a-b;  //30-10=10
        System.out.println("value of a "+a+" value of b "+b);
    }

    public static void main(String[] args) {
//      perfectName(6);
//      for(int i=1;i<=100;i++){
//        rangebetweenperfectNo(i);
//      }
//      primeNumber(11);
//      printVowelsAConsonant("Rohit");
//      reverseNumber(112);
//      reverseString("Rohit");
//      fibonacciSeries(10);
//      palindromeInteger(122);
//      palindromeString("aba");
//      swapTwoNumberUsingThirdVeriable(10,20);
//      swapTwoNumberWithoutUsingThirdVeriable(10,20);


    }

}