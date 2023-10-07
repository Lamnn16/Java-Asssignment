/**
 * Problem 1: Language Basics
 *
 * @author Nhat Lam Nguyen
 * @matrikel-Nr: 7219037
**/

public class MathCalc {
    public static void main(String[] args) {
        double sunDiameter = 865000;
        double sunVolume = 0;
        double earthDiameter = 7600;
        double earthVolume = 0;
        double ratioSunEarth = 0;
        
        earthVolume = (Math.pow(earthDiameter/2, 3) * Math.PI * 4) / 3;
        sunVolume = (Math.pow(sunDiameter/2, 3) * Math.PI * 4) / 3;
        ratioSunEarth = (sunVolume/earthVolume);
        
        System.out.println("The volume of the Earth is " + earthVolume + " cubic miles" + 
        "\nThe volume of the Sun is " + sunVolume + " cubic miles" + 
        "\nThe ratio of the volume of the Sun to the volume of the Earth is " + ratioSunEarth);
    }
}
 