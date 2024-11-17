import java.util.Arrays;

public class Main {
    public static int[] fix34(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 3){
                for (int j = k; j < nums.length; j++){
                    if (nums[j] == 4){
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                        k = j+1;
                        break;
                    }
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] array = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        System.out.println(Arrays.toString(fix34(array)));
    }
}