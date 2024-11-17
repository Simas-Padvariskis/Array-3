public class Main {
    public static boolean linearIn(int[] outer, int[] inner) {
        int k = 0;
        int x = 0;
        for (int i = 0; i < outer.length && k < inner.length; i++){
            if (outer[i] == inner[k]){
                x++;
                if ((k+1) <= inner.length)
                    k++;
            }
        }
        if (x == inner.length)
            return true;
        else
            return false;
    }
//----------------------------------------------------------
    public static void main(String[] args) {

        int[] array1 = {1, 2, 4, 4, 6};
        int[] array2 = {2, 4};
        System.out.println(linearIn(array1, array2));
    }
}