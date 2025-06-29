import java.util.ArrayList;
import java.util.Date;

public abstract class Clothes implements Comparable
{
    protected String brand;
    protected int Code;
    protected String size;
    protected String color;
    protected double length;
    protected String made_in;
    protected double price;
    protected java.util.Date date;
    //No-argument Constractor 
    public Clothes()
    {
    }
    //Parameterized constructor 
    public Clothes(String brand, String size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }
    //Constructor Overloading
    public Clothes(String brand, int Code, String size, String color, String made_in, double price)
    {
        this (brand,size,color); 
        this.Code = Code;
        this.made_in = made_in;
        this.price = price;
        date=new java.util.Date();
    }

    //Setters & Getters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMade_in() {
        return made_in;
    }

    public void setMade_in(String made_in) {
        this.made_in = made_in;
    }

    public double getPrice() {
        return price;
    }

    public java.util.Date getDate()
    {
        return  date;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //The function of this method is to compare prices of two objects of the same kind; by inputting the code of each object
    public boolean price_compare (int code, int code1 ,ArrayList <Clothes> list)
    {
        double price =0, price2=0;
        {
            for(int i=0;i<list.size();i++)
            {
                if(code == list.get(i).getCode())
                {
                    System.out.println("First code was found ");
                    System.out.println("The price is: "+list.get(i).getPrice());
                    price = list.get(i).getPrice();
                }
            }
            for( int i=0;i<list.size();i++)
            {
                if (code1 == list.get(i).getCode())
                {  
                    System.out.println("Second code was found ");
                    System.out.println("The price is: "+list.get(i).getPrice());
                    price2 = list.get(i).getPrice();
                }
            }
            if (price > price2)
            {
                System.out.println("First item is more expensive than second item");
                return false ; 
            }
            else if(price  < price2 )
            {
                System.out.println("Second item is more expensive than first item");
                return false ; 
            }

            else if(price  == price2 && price ==0 && price2 == 0)
                System.out.println("Codes were not found");

            else if (price == price2 )
                System.out.println("price is equal for both items");
        }
        return false;
    }

    //The function of this method is to test whether two objects of type Clothes are equal or not
    public boolean equals (int code ,int code1, ArrayList <Clothes> list)
    {
        Clothes b1 = null;
        Clothes b2 = null;
        {
            for(int i=0;i<list.size();i++)
            {
                if(code == list.get(i).getCode())
                {
                    System.out.println("First code was found ");
                    System.out.println("The item is: "+list.get(i));
                    b1 = list.get(i);
                }
            }
            for( int i=0;i<list.size();i++)
            {
                if (code1 == list.get(i).getCode())
                {  
                    System.out.println("Second code was found ");
                    System.out.println("The item is: "+list.get(i));
                    b2 = list.get(i);
                }
            }
            {
                if(b1.color==b2.color && b1.size==b2.size && b1.made_in==b2.made_in)
                {
                    System.out.println("object of code '"+b1.Code+"' is equals to the object of code "+ b2.Code);
                    return true;
                }
                else System.out.println("object of code '"+b1.Code+"' is not equals to the object of code "+ b2.Code);
            }
        }
        return false ;
    }

    /*
     *The function of this method is to add new items to the clothes list, but it tests whether the object has already been added in the 
     *array list or not first, which will not store an item that has already been added before
     */
    public boolean addObject (Clothes object, ArrayList objectList)
    {
        objectList.contains(object);
        if (objectList.contains(object)== false)
        {
            objectList.add(object);
            System.out.println("object of code '"+object.Code+"' was added at "  + object.getDate());
            return true;
        }
        else
        {
            System.out.println("object of code'"+object.Code+"' is alredy exist");
            return false;
        }
    }

    @Override
    public String toString () 
    {
        return "{ Code: " + this.Code + ", Brand: " + this.brand + ", Size: " + this.size + ", Color: " + this.color + ", Made in: " + this.made_in + ", Price: " + this.price + "}";
    }
}