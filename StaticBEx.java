class Laptop{
    int price;
    String Brand;
    static String Name;
    
    static{
        Name="LAPTOP";
        System.out.println("in Static Block");
    }

    public Laptop(){
        price =30000;
        Brand ="Asus";
        System.out.println("Its a Constructer");

    }
    public void show(){
        System.out.println(Brand+" : "+price+" : "+Name);
    }
}

public class StaticBEx {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        Laptop l2 = new Laptop();
    }
    
}
