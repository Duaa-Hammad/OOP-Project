import java.util.ArrayList;

public class Shirt extends Clothes 
{
    //Parameterized Constructor
    public Shirt (String brand, String size, String color)
    {
        //Calling super class constructor
        super (brand, size, color);
    }
    //Constructor Overloading
    public Shirt (String brand,int code,String size , String color , String made_in , double price)

    {
        //Calling super class constructor
        super(brand, code, size, color, made_in, price);
    }
}