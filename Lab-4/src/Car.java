public class Car
{
    private int price ;
    private String brand ;
    private int topSpeed ;
    private String color ;
    private String model ;

    public void setPrice(int pr)
    {
        price = pr;
    }

    public int getPrice()
    {
        return  price;
    }

    Car(int pr , String br , int ts , String cl , String md)
    {
        price = pr;
        brand = br;
        topSpeed = ts;
        color = cl ;
        model  = md;
    }

    Car(String br , String cl)
    {
        brand = br ;
        color = cl;
        price = -1;
        topSpeed = -1;
        model = "";
    }
}
