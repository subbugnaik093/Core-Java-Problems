class Bike{
    private int price;
    private String Brand;
    private static String name;

    public Bike() // default Constructer
    {
        this.price=100000;
        this.Brand="Yamaha";
        this.name="Vehicle";
    }
    public Bike(String name){
        this.price=110000;
        this.Brand="Honda";
        this.name=name;
    }
    public int getprice(){
        return price;
    }
    public String getBrand(){
        return Brand;
    }
    public String getName(){
        return name;
    }

}


public class ConstructerOvrLding {
    public static void main(String[] args) {
        Bike b1=new Bike();
        Bike b2=new Bike("VEHICLE");
        System.out.println(b1.getName()+" : "+b1.getBrand()+" : "+b1.getprice());
        System.out.println(b2.getName()+" : "+b2.getBrand()+" : "+b2.getprice());
        
    }
    
}
