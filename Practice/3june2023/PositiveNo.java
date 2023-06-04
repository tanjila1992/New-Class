import java.util.*;
class PositiveNo{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number: ");
        int n=sc.nextInt(); 
        String result=!(n==0)?((n>0)&&(n!=0)?"No is positive":"No is Negative"):"No is rational";
        System.out.println(result);

        }
}