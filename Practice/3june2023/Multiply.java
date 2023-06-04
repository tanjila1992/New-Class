import java.util.*;
class Multiply{
public static void main(String args[]){
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of a and b  :" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mult=0;
        for(int i=1;i<=b;i++){
             mult=mult+a;
        }
        System.out.println("Multiplication of two no : "+mult);
    }
}