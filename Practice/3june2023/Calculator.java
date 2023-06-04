import java.util.*;
class Calculator{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter value of a and b : ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println("Enter operator : ");
        char operator=sc.next().charAt(0);


    switch(operator){
        case '+':
                System.out.println("Addition of two no: "+(a+b));
                break;
        case '-':
                System.out.println("Sutraction of two no: "+(a-b));
                break;
        case '*':
                System.out.println("Multiplication of two no: "+(a*b));
                break;
        case '/':
                System.out.println("Division of two no: "+(a/b));
                break;
        default:
                System.out.println("Invalid operator");                               
    }
}
}