class Demo3{
 int i=100;
 int j=10;
  void add(){
    int result=i+j;
    System.out.println("Addition of two no: "+result);//110  110
  }

  void sub(int i,int j){ 
   int result= this.i-this.j;
   System.out.println("Subtraction of two no: "+result);//5   90
  }

  int div(){
    System.out.println("division of two no: "+i/j);//10   compiletime  error
    return 0;
  }

  int mult(int i,int j){
    int result=i*j;
  System.out.println("Multiplication of two no: "+result); //10   10
  return result;
  }

  public static void main(String args[]){
    Demo3 d=new Demo3();
    d.add();
    d.sub(10,5);
    d.div();
    d.mult(5,2);
  }
}