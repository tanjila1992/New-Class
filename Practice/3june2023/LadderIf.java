import java.util.*;
class LadderIf{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        if(no==0){
            System.out.println("Sunday");
        }
        else if(no==1){
            System.out.println("Monday");
        }

        else if(no==2){
            System.out.println("Tuesday");
        }

        else if(no==3){
            System.out.println("Wenesday");
        }

        else if(no==4){
            System.out.println("Thirsday");
        }

        else if(no==5){
            System.out.println("Friday");
        }

        else if(no==6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Enter no between 0 to 6.");
        }
        
    }
}