package tst;

class A{  
 private int i;
 
 int setI(int j){
     i=j;
     return j;
 }
 int getI(){
     return i;
 }
}  
class B{  
 public static void main(String args[]){  
  A obj=new A(); 
  A obj2=new A();
  obj.setI(5);
     System.out.println(obj2.getI());
}
}