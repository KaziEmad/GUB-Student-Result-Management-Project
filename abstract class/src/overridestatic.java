class A{
    void X(){
        System.out.println("This method is in A");
    }
}
class B extends A{
    void X(){
        System.out.println("This method is in A");
    }
}

class main{
    public static void main(String[] args) {
        B obj=new B;
        obj.X();
    }
}