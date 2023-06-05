package academy.devonline.java.basic.section01_setup.section06_setup;

import java.util.Arrays;

public class SwapMinAndMaxArrayElement {
    public static void main(String[] args) {
        int [] array = {1,-2,3,8,5};
        var minelement = 0;
        var valuemin = array[0];
        var maxelement = 0;
        var valuemax = array[0];
        for (int i = 0; i < array.length; i++) {
            var ren = array[i];
            if (ren<valuemin){
                valuemin=ren;
                minelement =i;
            }
            if (ren>valuemax){
                valuemax=ren;
                maxelement =i;
            }


        }
        var temp = array[maxelement];
       array[maxelement]=array[minelement];
        array[minelement]= temp;

        System.out.println(Arrays.toString(array));
    }
}
