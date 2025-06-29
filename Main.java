import java.util.Scanner;
import java.util.ArrayList;

public class Main  
{
    Scanner s = new Scanner (System.in);
    public static void main (String [] args) 
    {
        ArrayList //<Clothes>
        suits = new ArrayList ();
        ArrayList <Clothes> dress = new ArrayList ();
        ArrayList <Clothes> trousers = new ArrayList ();
        ArrayList <Clothes> shirts = new ArrayList ();
        ArrayList <Clothes> skirt = new ArrayList ();
        ArrayList <Clothes> salesList = new ArrayList ();       

        Suit s6 = new Suit (new Trousers ("Mango","XXL", "White", "Italy"), new Belt ("Mango", "Black", "Italy", 2.0), new Shirt ("Mango", "XXL", "White"), new Jacket ("Mango", "XXL", "Black"),400 ,6);
        Suit s7 = new Suit (new Trousers ("Mango","XL", "White", "Italy"), new Belt ("Mango", "Black", "Italy", 1.75), new Shirt ("Mango", "XL", "White"), new Jacket ("Mango", "XL", "Black"),165,7);
        Suit s8 = new Suit (new Trousers ("Mango","S", "White", "Italy"), new Belt ("Mango", "Black", "Italy", 1.00), new Shirt ("Mango", "S", "White"), new Jacket ("Mango", "S", "Black"),160 ,8);
        Suit s9 = new Suit (new Trousers ("Mango","L", "White", "Italy"), new Belt ("Mango", "Black", "Italy", 1.5), new Shirt ("Mango", "L", "White"), new Jacket ("Mango", "L", "Black"),160 ,9);
        Suit s10 = new Suit (new Trousers ("Mango","XS", "White", "Italy"), new Belt ("Mango", "Black", "Italy",0.5), new Shirt ("Mango","XS", "White"), new Jacket ("Mango","XS", "Black"),160,10);
        suits.add(s6); 
        suits.add(s7);
        suits.add(s8);
        suits.add(s9);
        suits.add(s10);

        Trousers t1 = new Trousers ("Calvin klein",20, "XS", "Dark Blue", "The US", 200);
        Trousers t2 = new Trousers ("Calvin klein",21, "XS", "Dark Blue", "The US", 150);
        Trousers t3 = new Trousers("Calvin klein",22, "XS", "Dark Blue", "The US", 75);
        Trousers t4 = new Trousers ("Calvin klein",23, "XS", "Dark Blue", "The US", 90);
        Trousers t5 = new Trousers ("Calvin klein",24, "S", "Dark Blue", "The US", 345);
        trousers.add(t1);
        trousers.add(t2);
        trousers.add(t3);
        trousers.add(t4);
        trousers.add(t5);

        Dress d1 = new Dress ("BURBERRY",30, "XS", "Dark Blue", "The UK",500);
        Dress d2 = new Dress ("CHANEL",31, "XS", "Dark Blue", "France",700);
        Dress d3 = new Dress ("HERMES",32, "XS", "Dark Blue", "France, Paris",900);
        Dress d4 = new Dress ("PRADA",33, "XS", "Dark Blue", "Italy", 750);
        Dress d5 = new Dress ("VERSACHE",34, "XS", "Dark Blue", "Italy",890);
        dress.add(d1);
        dress.add(d2);
        dress.add(d3);
        dress.add(d4);
        dress.add(d5);

        Shirt sh1=new Shirt("polo" ,111,"M" ,"Blue","Turkey",150);
        Shirt sh2=new Shirt("polo" ,112,"XXl" ,"Green","Turkey",150);
        Shirt sh3=new Shirt("Mango" ,113,"L" ,"White","Turkey",170);
        Shirt sh4=new Shirt("Barbary" ,114,"Xl" ,"Red","Turkey",170);
        Shirt sh5=new Shirt("Zara" ,115,"S" ,"Blue","Turkey",130);
        shirts.add(sh1);
        shirts.add(sh2);
        shirts.add(sh3);
        shirts.add(sh4);
        shirts.add(sh5);

        Skirt sk1=new Skirt("Zara",222,"M","Red","Turkey",130);
        Skirt sk2=new Skirt("Zara",223,"S","Green","Turkey",190);
        Skirt sk3=new Skirt("Zara",224,"XS","Black","Turkey",150);
        Skirt sk4=new Skirt("Zara",225,"X","White","Turkey",152);
        Skirt sk5=new Skirt("Zara",226,"XXS","Black","Turkey",155);
        skirt.add(sk1);
        skirt.add(sk2);
        skirt.add(sk3);
        skirt.add(sk4);
        skirt.add(sk5);

        Scanner s=new Scanner(System.in);
        int x;
        do 
        { 
            System.out.println("\n--------------------------------------------Main Menue------------------------------------");
            System.out.println("If you want to show the current items press '0'");
            System.out.println("If you want to add new item press '1'");
            System.out.println("If you want to know how many items in your store press '2'");
            System.out.println("To find by code press '3'");
            System.out.println("To transfer to sales list press '4'");
            System.out.println("To remove an item press '5'");
            System.out.println("To modify an item price press '6'");
            System.out.println("If you want to compare prices press '7'");
            System.out.println("To end program press '8'");
            System.out.println("-----------------------------------------------------------------------------------------\n");
            x = s.nextInt();
            switch (x)
            {
                case 0:
                    System.out.println("Suits:\n"+suits);
                    System.out.println("-------------------------------------");
                    System.out.println("Trousers:\n"+trousers);
                    System.out.println("-------------------------------------");
                    System.out.println("Dresses:\n"+dress);
                    System.out.println("-------------------------------------");
                    System.out.println("Skirts:\n"+skirt);
                    System.out.println("-------------------------------------");
                    System.out.println("Shirts:\n"+shirts);
                    System.out.println("-------------------------------------");
                    System.out.println("Sales list:\n"+salesList);

                    break;

                case 1: 
                    System.out.println("What do you want to add?");
                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\nplease choose a number");
                    int item = s.nextInt();
                    System.out.println("How many? ");
                    int n = s.nextInt();
                    //Trousers
                    if (item == 1)
                    {
                        for (int i =0; i<n; i++)
                        {
                            System.out.println("Input the brand, code, size, color, made-in, price: ");
                            Trousers tr=new Trousers(s.next(),s.nextInt(),s.next(),s.next(), s.next(),s.nextDouble());
                            tr.addObject(tr, trousers);

                        }
                    }
                    //Dress
                    else if (item == 2)
                    {
                        for (int i =0; i<n; i++)
                        {
                            System.out.println("Input the brand, code, size, color, made-in, price: ");
                            Dress dr=new Dress(s.next(),s.nextInt(),s.next(),s.next(), s.next(),s.nextDouble());
                            dr.addObject(dr, dress);
                        }
                    }
                    //Shirt
                    else if (item == 3)
                    {
                        for (int i =0; i<n; i++)
                        {
                            System.out.println("Input the brand, code, size, color, made-in, price: ");
                            Shirt sh=new Shirt (s.next(),s.nextInt(),s.next(),s.next(), s.next(),s.nextDouble());
                            sh.addObject(sh, shirts);
                        }
                    }
                    //Skirt
                    else if (item == 4)
                    {
                        for (int i =0; i<n; i++)
                        {
                            System.out.println("Input the brand, code, size, color, made-in, price: ");
                            Skirt sk=new Skirt (s.next(),s.nextInt(),s.next(),s.next(), s.next(),s.nextDouble());
                            sk.addObject(sk, skirt);
                        }
                    }
                    //Suit
                    else if (item == 5)
                    {
                        for (int i =0; i<n; i++)
                        {
                            System.out.println("Input brand, size, color, made-in for the trousers: ");
                            Trousers trouser =new Trousers(s.next(),s.next(),s.next(), s.next());

                            System.out.println("Input brand, size, color, made-in, length for the belt: ");
                            Belt belt =new Belt (s.next(),s.next(),s.next(), s.nextDouble());

                            System.out.println("Input brand, size, color  for the shirt: ");
                            Shirt shirt =new Shirt (s.next(),s.next(),s.next());

                            System.out.println("Input brand, size, color for the jacket: ");
                            Jacket jacket =new Jacket (s.next(),s.next(),s.next());

                            System.out.println("Input price for the suit: ");
                            double price = s.nextDouble();
                            System.out.println("Input code for the suit: ");
                            int code = s.nextInt();
                            Suit su =new Suit (trouser, belt, shirt, jacket, price, code);
                            su.addObject(su, suits);
                        }
                    }
                    break;

                case 2:

                    System.out.println("The number of items in suits list is: "+suits.size());
                    System.out.println("The number of items in dresses list is: "+dress.size());
                    System.out.println("The number of items in trousers list is: "+trousers.size());
                    System.out.println("The number of items in skirts list is: "+ skirt.size());
                    System.out.println("The number of items in shirts list is: "+ shirts.size());
                    System.out.println("The number of items in sales list is: "+salesList.size());

                    break;

                case 3: 

                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\nplease choose a number");
                    int choise = s.nextInt();
                    System.out.println("Input the code: ");
                    if (choise == 1)
                        Sales.find_by_code (s.nextInt(),"trousers", trousers);
                    else if (choise == 2)
                        Sales.find_by_code (s.nextInt(),"dress", dress);
                    else if (choise == 3)
                        Sales.find_by_code (s.nextInt(),"shirt", shirts);
                    else if (choise == 4)
                        Sales.find_by_code (s.nextInt(),"skirt", skirt);
                    else if (choise == 5)
                        Sales.find_by_code (s.nextInt(),"suit", suits);
                    break;
                case 4:
                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\nplease choose a number");
                    choise = s.nextInt();
                    System.out.println("Input the code: ");
                    if (choise == 1)
                        Sales.transfer_to_salesList (s.nextInt(),"trousers", trousers, salesList);
                    else if (choise == 2)
                        Sales.transfer_to_salesList (s.nextInt(),"dress", dress, salesList);
                    else if (choise == 3)
                        Sales.transfer_to_salesList (s.nextInt(),"shirt", shirts, salesList);
                    else if (choise == 4)
                        Sales.transfer_to_salesList (s.nextInt(),"skirt", skirt, salesList);
                    else if (choise == 5)
                        Sales.transfer_to_salesList (s.nextInt(),"suit", suits, salesList);
                    break;
                case 5:
                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\n6- Sales list");
                    System.out.println("please choose array list to remove an item from it ");
                    choise = s.nextInt();
                    System.out.println("Input the code: ");
                    if (choise == 1)
                        Sales.remove_from (s.nextInt(),"trousers", trousers);
                    else if (choise == 2)
                        Sales.remove_from (s.nextInt(),"dress", dress);
                    else if (choise == 3)
                        Sales.remove_from (s.nextInt(),"shirt", shirts);
                    else if (choise == 4)
                        Sales.remove_from (s.nextInt(),"skirt", skirt);
                    else if (choise == 5)
                        Sales.remove_from (s.nextInt(),"suit", suits);
                    else if (choise == 6)
                        Sales.remove_from (s.nextInt(),"sales list", salesList);

                    break;
                case 6:
                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\nplease choose a number");
                    choise = s.nextInt();
                    System.out.println("Input the code: ");
                    System.out.println("Input the new price: ");
                    if (choise == 1)
                        Sales.modify_price(s.nextInt(),"trousers", trousers, s.nextDouble());
                    else if (choise == 2)
                        Sales.modify_price(s.nextInt(),"dress", dress, s.nextDouble());
                    else if (choise == 3)
                        Sales.modify_price(s.nextInt(),"shirt", shirts, s.nextDouble());
                    else if (choise == 4)
                        Sales.modify_price(s.nextInt(),"skirt", skirt, s.nextDouble());
                    else if (choise == 5)
                        Sales.modify_price(s.nextInt(),"suit", suits, s.nextDouble());
                    break;

                case 7 :
                    System.out.println("1- Trousers\n2- Dress\n3- Shirt \n4- Skirt\n5- Suit\nplease choose a number");
                    choise = s.nextInt();
                    System.out.println("Input the code of the first item: ");
                    System.out.println("Input the code of the second item: ");
                    if (choise == 1)
                        t1.price_compare(s.nextInt(),s.nextInt(),trousers);
                    else if(choise == 2)
                        d1.price_compare(s.nextInt(),s.nextInt(),dress);
                    else if(choise == 3)
                        sh1.price_compare(s.nextInt(),s.nextInt(),shirts);
                    else if(choise == 4)
                        sk1.price_compare(s.nextInt(),s.nextInt(),skirt);
                    else if(choise == 5)
                        s6.price_compare(s.nextInt(),s.nextInt(),suits);
                    break ;
                case 8: 
                    System.out.println("-----------------------------------------------------------------------------------------\n");
                    System.out.println("End!");
                    System.out.println("-----------------------------------------------------------------------------------------\n");
                    break;
            } //End switch
        }  while (x != 8); //End do while
    }
}