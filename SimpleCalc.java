/**
 * InnerSimpleCalc
 */
class InnerSimpleCalc {


public int demo(int n1, int n2){
    int r=n1+n2;
    return r;

}
    
}
public class SimpleCalc {
  public static void main(String[] args) {
    int val1 =10;
    int val2=15;
    InnerSimpleCalc inner =new InnerSimpleCalc();
    int result = inner.demo(val1, val2);
    System.out.println(result);

    
  }  
}
