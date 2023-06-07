class Mobile{
    String brand;
    int price;
    static String name;
    static
    {
        name = "phone";
        System.out.println("in static");

    }

    public Mobile()
    {
        System.out.println("in constructer");
    }

    public void show()
    {
        System.out.println(brand + ":" + price +":" +name);
    }
}

public class hello
{
    public static void main(String args[])
    {
       
       Mobile mb = new Mobile();
       mb.brand = "samsung";
       mb.price = 1200;
       Mobile.name = "phone";

       Mobile mb2 = new Mobile();
       mb2.brand = "apple";
       mb2.price = 100;
       Mobile.name = "phone1";

       Mobile mb3 = new Mobile();
       mb3.brand = "nokia";
       mb3.price = 10;
       Mobile.name = "phone3";

       Mobile.name = "phone9";

       mb.show();
       mb2.show();
       mb3.show();
    
        

    }
}    