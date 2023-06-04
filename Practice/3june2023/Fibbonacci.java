import java.util.*;
class Fibbonacci{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(); 
        int i=0,j=1,temp=0;
        for(int k=1;k<=n;k++){
        System.out.println("Fibbonacci series : "+i);

            temp=i+j;
            i=j;
            j=temp;

        }  
    }
}