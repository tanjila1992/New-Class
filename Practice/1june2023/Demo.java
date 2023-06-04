class Demo{
    static{
        System.out.println("In static block");
    }
    void function(){
        System.out.println("In void ");
    }

   static int function1(){
        System.out.println("In function1");
        return 10;
    }

    String function2(){
        System.out.println("In function2");
        return "Welcome";
    }

    int function3(int a,int b){
        System.out.println("In function3");
        return a+b;
    }

    public static void main(String args[]){
       Demo d=new Demo();
       d.function();
       function1();
       d. function2();
       d.function3(10,20);

    }

}   