import javax.print.attribute.standard.MediaSize.NA;

class Human{
    private int age;
    private String Name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }

}

public class EncapsulationEx {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(18);
        obj.setName("Subrahmanya");

        System.out.println(obj.getName()+" : "+obj.getAge());
        
    }
    
}
