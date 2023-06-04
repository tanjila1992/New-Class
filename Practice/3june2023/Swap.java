import java.util.*;
class Swap{
     public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        System.out.println("original value of a and b are :" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        //swapWithoutUsingTemp(a,b);
        swapUsingTemp(a,b);

       }

      static void swapWithoutUsingTemp(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping value of a and b are :"+a +" ," +b);
       }

      static void swapUsingTemp(int a,int b){         //a=2  b=3
        int temp;
        temp=a;
        a=b;
        b=temp;

                System.out.println("After swapping value of a and b are :"+a +" ," +b);
        
       }
}