import java.util.*;
class EvenOdd{
    public static void main(String args[]){
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter number: ");
         int n=sc.nextInt();
         //String result=(n%2==0)? +n" Number is even":+n" Number is odd";
         //System.out.println(result);

         String result=(n%2==0)?((!(n%2==1))?" Number is even":"Number is odd"):" Number is odd";
         System.out.println(result);

    }
}