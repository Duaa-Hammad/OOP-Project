
public class Skirt extends Clothes 
{
    //Parameterized constructor
    public Skirt (String brand, String size, String color)
    {
        //Calling super class constructor
        super (brand, size, color);
    }
    //Constructor Overloading
    public Skirt (String brand,int code,String size , String color , String made_in , double price)

    {
        //Calling super class constructor
        super(brand, code, size, color, made_in, price);
    }
}