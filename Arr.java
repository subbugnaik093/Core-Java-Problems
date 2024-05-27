public class Arr {
    public static void main(String[] args) {
        int num[]=new int[4];

        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*10);

        }
for(int n : num){
    System.out.print(n+" ");

}

    }
    
}
