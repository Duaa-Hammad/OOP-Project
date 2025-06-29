import java.util.ArrayList;
public class Suit extends Clothes
{
    private Trousers trouser;
    private Belt belt;
    private Shirt shirt;
    private Jacket jacket;

    //No-argument Constructor 
    public Suit ()
    {

    }
    //Parameterized Constructor
    public Suit(Trousers trouser, Belt belt, Shirt shirt, Jacket jacket,double price,int Code) 
    {
        this.trouser = trouser;
        this.belt = belt;
        this.shirt = shirt;
        this.jacket = jacket;
        this.price=price;
        this.Code=Code;
    }
    //Getters
    public Trousers getTrouser()
    {
        return trouser;
    }

    public Belt getBelt()
    {
        return belt ; 
    }

    public Shirt getShirt()
    {
        return shirt ; 
    }

    public Jacket getJacket()
    {
        return jacket ;
    }
    //Setters
    public void setTrouser(Trousers trouser) {
        this.trouser = trouser;
    }

    public void setBelt(Belt belt) {
        this.belt = belt;
    }

    public void setShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    //Overloading Method
    public boolean equals (Suit object)
    {

        if(this.trouser.color==object.trouser.color && this.trouser.size==object.trouser.size && this.trouser.made_in==object.trouser.made_in && this.shirt.color==object.shirt.color && this.shirt.size==object.shirt.size && this.shirt.made_in==object.shirt.made_in && this.jacket.color==object.jacket.color && this.jacket.size==object.jacket.size && this.jacket.made_in==object.jacket.made_in && this.belt.color==object.belt.color && this.belt.length==object.belt.length && this.belt.made_in==object.belt.made_in)
        {
            System.out.println("Suits are equals");
            return true;
        }
        else System.out.println("Suits are not equals");
        return false ;
    }

    @Override
    public String toString ()
    {
        return "Suit {Code: " + this.Code + ", Price: "+ this.price  + ", Trousers: " + this.trouser  + ", Belt: " + this.belt + ", Shirt: " + this.shirt + ", Jacket: " + this.jacket +"}";
    }
}