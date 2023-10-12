public class StringSort {
    public static void main(String []args) {
        String text = "to be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";

        String temp;
        String[] str = text.split("\\s+");
        System.out.println("The given soliloquy in sorted order:");
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[i]) < 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
            System.out.println(str[i]);
        }
    }
}
