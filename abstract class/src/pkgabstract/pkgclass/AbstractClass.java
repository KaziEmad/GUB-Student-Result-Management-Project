abstract class student{  
  void student_data(); 
}
class A extends student{
    void student_data(){System.out.println("I am a Student.");};
}

class Main{  
    public static void main(String args[]){  
    A obj = new A();  
    obj.student_data();  
}  
}  