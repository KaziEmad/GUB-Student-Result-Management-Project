package overridetest;

class parent{
    public static void main(String[] args) {
        System.out.println("This is parent class");
    }
}
class child extends parent{
    public static void main(String[] args) {
        System.out.println("This is child class");
    }
    
}

public class OverrideTest {
    public static void main(String[] args) {
          parent p = new parent();
          parent p1 = new child();
          child c = new child();
          p.main(new String[5]);
          p1.main(new String[5]);
          c.main(new String[5]);
          ///System.out.println("test");
    }  
}
