
interface Interface1 {

    public void method1();
}

interface Interface2 extends Interface1 {

    public void method2();
}

public class OOP_Lab implements Interface2 {

    public void method1() {
        System.out.println("This is Method 1");
    }

    public void method2() {
        System.out.println("This is Method 2");
    }

    public static void main(String args[]) {
        OOP_Lab obj = new OOP_Lab();
        obj.method1();
        obj.method2();

    }
}
