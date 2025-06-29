public class Trousers extends Clothes
{
    //No-argument constructor
    public Trousers () {}

    //Parameterized Constructor
    public Trousers (String brand, String size, String color, String made_in)
    {
        //Calling super class constructor 
        super (brand, size, color);
        this.made_in= made_in;
    }
    //Constructor Overloading
    public Trousers (String brand,int code,String size , String color , String made_in , double price)

    {
        //Calling super class constructor 
        super(brand, code, size, color,made_in, price);
    }

    public Trousers (String brand, String size, String color,double price)
    {
        //Calling super class constructor 
        super (brand, size, color);
        this.price=price;
    }
}
