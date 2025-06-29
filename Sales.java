import java.util.ArrayList;
public class Sales 
{
    //The function of this method is to find the object (Suit, dress, skirt, jacket,...) by its code 
    public static  boolean find_by_code (int code,String item, ArrayList <Clothes> list)
    {
        if(item == "dress" || item == "trousers" || item == "shirt" || item == "skirt" || item == "suit")
            for (int i=0; i< list.size(); i++)
            {
                list.get(i);
                if (code == list.get(i).getCode())
                {
                    System.out.println("The object of code "+ code+ " was found at "+ list.get(i).getDate());
                    System.out.println(list.get(i));//print the object 
                    return true;
                } 
            }
        else System.out.println("Error!");
        return false;
    }

    /*The function of this method is to tranfer an item to sales list in case the object was sold, and removing it from its curren list at the same time
    this operation is done by inputting the object's code first to identify which object you want to transfer*/

    public static boolean transfer_to_salesList (int code,String item, ArrayList <Clothes> list,ArrayList <Clothes> salesList )
    {
        if(item == "dress" || item == "trousers" || item == "shirt" || item == "skirt" || item == "suit")
            for (int i=0; i< list.size(); i++)
            {
                list.get(i);
                if (code == list.get(i).getCode())
                {
                    salesList.add(list.get(i));
                    System.out.println("The object of code "+ code+ " was added to the list at " +list.get(i).getDate());
                    list.remove(list.get(i));

                    return true;
                }
            }
        else System.out.println("Error!");
        return false;
    }
    //Remove an item from a list by inputting its code
    public static  boolean remove_from (int code,String item, ArrayList <Clothes> list)
    {
        if(item == "dress" || item == "trousers" || item == "shirt" || item == "skirt" || item == "suit")
        {
            for (int i=0; i< list.size(); i++)
            {
                list.get(i);
                if (code == list.get(i).getCode())
                {
                    System.out.println("The object of code "+ code+ " was removed at  "+list.get(i).getDate());
                    list.remove(list.get(i));
                    return true;
                }
            }
            System.out.println("Error!");
        }
        return false;
    }
    //The function of this method is to mdify an item price by inputting its code, its name and its list and the new price
    public static boolean modify_price (int code,String item, ArrayList <Clothes> list, double NewPrice)
    {
        if(item == "dress" || item == "trousers" || item == "shirt" || item == "skirt" || item == "suit")
            for (int i=0; i< list.size(); i++)
            {
                if(code == list.get(i).getCode())
                {
                    System.out.println("The price of this item is:  "+list.get(i).getPrice());
                    list.get(i).setPrice(NewPrice);
                    System.out.println("The price updated successfully at  "+ list.get(i).getDate());
                    System.out.println(list.get(i));
                    return true;
                } 
            }
        else System.out.println("Faild!");
        return false;
    }
}