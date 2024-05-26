class calculator{
    public int add(int n1, int n2){
        int total= n1+n2;
        return total;
    }
    public int add(int n1, int n2, int n3){
        int total =n1+n2+n3;
        return total;
    }
    public double add(int n1, double n2){
        double total=n1+n2;
        return total;
    }
}
public class CalcMo {
    public static void main(String[] args) {
        calculator cal = new calculator();
        int result1=cal.add(5, 7);
        double result2=cal.add(6, 10.8);
        int result3= cal.add(10,90,100);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        
    }
}
