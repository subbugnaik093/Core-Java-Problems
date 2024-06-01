public class Result {
    public static void main(String[] args) {
        ScientificCal c = new ScientificCal();
        int r1 = c.add(8, 5);
        int r2 = c.sub(8, 3);
        int r3 = c.multi(8, 5);
        int r4 = c.division(5, 10);
        int r5 = (int)c.pow(5,2);



        System.out.println(r1 + " "+r2 + " " + r3 + " "+r4 + " "+r5);

    }
    
}
