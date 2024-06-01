class Human{
    private int age;
    private String name;

    public Human(){
        age=13;
        name="Subbu";
        System.out.println("In constucter");
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}

public class ConstructerEx {
    public static void main(String[] args) {
        Human h1=new Human();
        Human h2= new Human();
        System.out.println(h1.getName()+" : " + h1.getAge());


        h1.setAge(22);
        h1.setName("Subrahmanya");
        
        System.out.println(h1.getName()+" : " + h1.getAge());

        
    }
    
}
