import java.util.*;
class Demo10{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        switch(i){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wenesday"); 
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");  
                break;
            case 6:
                System.out.println("Saturday"); 
                break;
            default:
                System.out.println("Enter no between 0 to 6"); 
          

        }

    }
}