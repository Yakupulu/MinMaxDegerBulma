import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {5,6,89,6,23,7,2,36,23,8,63,21,9};

        //daha az kod ile yapilisi:

        Arrays.sort(list);
        System.out.println("min:"+list[0]);
        System.out.println("max:"+list[list.length-1]);


        // hocanin anlattigi sekilde:

        int max = list[0];
        int min = list[0];
        for (int i : list) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        System.out.println("min:    "+min);
        System.out.println("max:    "+max);

    }
}
