package areamanipulation;

public class Area 
{
    private double area;
    
    public double getArea()
    {
        return area;
    }
    
    public void areaCircle(double radius)
    {
        area = Math.PI * Math.pow(radius, 2);
    }
    
    public void areaSquare(int length)
    {
        area = Math.pow(length, 2);
    }
    
    public void areaRectangle(int length, int width)
    {
        area = length * width;
    }
    
    public void areaTriangle(int len_a, int len_b, int len_c)
    {
        double s = (len_a + len_b + len_c) / 2;
        double x = s * (s - len_a) * (s - len_b) * (s - len_c);
        area = Math.sqrt(x);
    }
}
