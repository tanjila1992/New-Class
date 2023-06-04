class Demo7{
    
       int i=100,j=10;

       void add(){
        int result=i+j;
        System.out.println("Addition: "+i+j);     //10010
        System.out.println("Addition: "+(i+j));   //110
        System.out.println("Addition: "+result);  //110
       }

       void sub(int i,int j){
        int result=i-j;
        //System.out.println("Subtraction:"+i-j);    //20-10
        System.out.println("Subtraction:"+(i-j));  //10
        System.out.println("Subtraction:"+result); //10

       }

       int mult(){
         int result =i*j;
         System.out.println("Multiplication:"+i*j);     //1000
         System.out.println("Multiplication:"+(i*j));   //1000
         return result;                                 //1000
       }

       int div(int i,int j){
        // this.i=i;
         //this.j=j;
         int result=this.i/this.j;
         System.out.println("Division:"+i/j);     //2
         System.out.println("Division:"+(i/j));   //2
         System.out.println("Division:"+result);  //10
         return result;                           //10

       }

       public static void main(String args[]){
        Demo7 d=new Demo7();
        d.add();
        d.sub(20,10);
        //d.mult();
        System.out.println(d.mult());
        //d.div(20,10);
        System.out.println(d.div(20,10));

        //System.out.println("Answer: "+10+20-10*10/2);         //102050
        //System.out.println("Answer: "+(10+20)-(10*10/2));     //3050
       }
}