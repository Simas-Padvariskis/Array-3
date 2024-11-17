public class Main {
    public static int maxSpan(int[] nums) {
        int max = 0;
        int j = 0;
        int span = 0;
        for(int i = 0; i < nums.length; i++) {
            j = nums.length - 1;
            while(nums[i] != nums[j]){
                j--;
            }
            span = j - i + 1;
            if(span > max)
                max = span;
        }
        return max;
    }
//----------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] array = {3, 9, 3};
        System.out.println(maxSpan(array));
    }
}