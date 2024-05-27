import java.util.Scanner;

public class ThreeDArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums[][][]=new int[2][3][4];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                for(int k =0;k<nums[i][j].length;k++){
                    nums[i][j][k]=scan.nextInt();
                }
            }
        }
        for(int [][]n : nums){
            for(int []m : n){
                for(int r : m){
                    System.out.print(r+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
    
}
