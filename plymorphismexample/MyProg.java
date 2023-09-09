package plymorphismexample;

public class MyProg extends A
{
    public MyProg()
    {
        
    }
    
    public MyProg(int x)
    {
        
    }    
    
    public MyProg(String x)
    {
        
    }
    @Override
    public void show()
        {
            System.out.println("MyProg Show with no pram");
        }
    public void show(int x)
        {
            System.out.println("MyProg Show with 1 int pram");
        }
    public void show(double x)
        {
            System.out.println("MyProg Show with 1 double pram");
        }          
    public static void main(String[] args) 
    {
        MyProg abc = new MyProg();
        abc.show();
        //abc.show(5);
        //abc.show(5.2);
    }   
}
