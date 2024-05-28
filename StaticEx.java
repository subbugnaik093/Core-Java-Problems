class Mobile{
    int price;
    String Brand;
    int productno;
   static String name;

    public void show1(){
        System.out.println(Brand+" "+price+" "+name);
    }
    public static void show2(Mobile m1){
        System.out.println(m1.Brand+" "+m1.price+" "+name);

    }
}

public class StaticEx {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.price=40000;
        m1.Brand="Poco M5";
        m1.productno=990;
        Mobile.name="Smart Phone";

        Mobile m2=new Mobile();
        m2.price=40000;
        m2.Brand="Poco M5";
        m2.productno=990;
        Mobile.name="Smart Phone";

        Mobile.name="Apple";
        

        m1.show1();
        m2.show1();
        Mobile.show2(m1);

    }
}
