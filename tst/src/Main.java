class parent{
    
    int x;
   final void money(){
        x=100;
        System.out.println(x);
    }
}

class child extends parent{
    void money(){
        x=200; //error: money() in child cannot override money() in parent
        System.out.println(x);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        child ob=new child();
        ob.money();
    }
}