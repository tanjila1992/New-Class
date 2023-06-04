import java.util.*;
class LargerNo{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of a and b  :" );
        int a=sc.nextInt();
        int b=sc.nextInt();
       String answer= a>b?"a is greater":"b is greater";
       System.out.println(answer);
}
}