public class MutliDArr {
    public static void main(String[] args) {
        int nums[][]=new int[4][5];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random() * 100);
            }
        }
        for(int [] n : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    
}
