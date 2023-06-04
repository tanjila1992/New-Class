class Demo6{
    public static void main(String args[]){
        int i=123,sum=0;
        while(i>0){
           int num=i%10;
            sum=sum+num;
            i=i/10;
        }

        System.out.println(sum);
        
    }
}