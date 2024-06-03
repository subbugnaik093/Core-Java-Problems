class Calcs{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalcs extends Calcs{
    public int add(int n1, int n2){
        return n1 + n2+1;
    }
}

public class MethodOverRidingEx {
    public static void main(String[] args) {
        AdvCalcs adv = new AdvCalcs();
        int res = adv.add(5, 3);
        System.out.println(res);

        
    }
    
}
