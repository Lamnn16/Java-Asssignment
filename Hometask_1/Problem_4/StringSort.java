/**
 * Problem 4: Object Basics and Simple Data Objects
 *
 * @author Nhat Lam Nguyen
 * @matrikel-Nr: 7219037
**/

public class StringSort {
    public static void main(String []args) {
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        
        String[] str = text.split("\\s+");
        String temp;
        System.out.println("Strings in sorted order:");
        /* Bubble Sort */
        for (int j = 0; j < str.length; j++) {
              for (int i = j + 1; i < str.length; i++) {
            if (str[i].compareTo(str[j]) < 0) {
                temp = str[j];
                str[j] = str[i];
                str[i] = temp;
            }
           }
           System.out.println(str[j]);
        }
    }   
}
