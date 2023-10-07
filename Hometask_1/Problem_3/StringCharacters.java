/**
 * Problem 3: Object Basics
 *
 * @author Nhat Lam Nguyen
 * @matrikel-Nr: 7219037
**/

public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
        +"Whether `tis nobler in the mind to suffer"
        +" the slings and arrows of outrageous fortune,"
        +" or to take arms against a sea of troubles,"
        +" and by opposing end them?";
        int spaces = 0,
        vowels = 0,
        letters = 0;
        //YOUR CODE HERE
        System.out.println(text);
        char[] ch = text.toCharArray();
        for (int i = 0; i < text.length(); i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                vowels ++;
            }
            else if (Character.isWhitespace(ch[i])) {
                spaces ++;
            }
        }
        letters = text.length() - spaces;
        System.out.println("The text contained vowels: " + vowels + "\nconsonants: " + (letters - vowels) + "\nspaces: " + spaces);
        }
    }
