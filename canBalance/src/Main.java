
public class Main {
    public static boolean canBalance(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int k = 0;
        int leftSum = 0;
        int rightSum = 0;

        if (sum % 2 == 0) {
            for (int i = 0; leftSum < (sum / 2); i++) {
                leftSum += nums[i];
                k++;
            }
            for (int i = k; i < nums.length; i++) {
                rightSum += nums[i];
            }
            if (leftSum == rightSum)
                return true;
            else
                return false;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 2, 1};
        System.out.println(canBalance(array));
    }
}