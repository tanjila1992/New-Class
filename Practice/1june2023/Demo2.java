class Demo2{
    static{
        System.out.println("Hello");
    }

    void fun1(){
        System.out.println("Inside fun1");
        
    }

    int fun2(){
        System.out.println("Inside fun2");
        return 0;
    }

    static String fun3(){
        System.out.println("Inside fun3");
        return "";
    }

    public static void main(String args[]){

        System.out.println("Inside main");
        fun3();
        Demo2 d=new Demo2();
        d.fun1();
        d.fun2();
    }
}