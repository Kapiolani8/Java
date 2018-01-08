import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(double legA, double legB) {
        double legC = Math.sqrt( Math.pow(legA, 2) + Math.pow(legB,2));

        String hypotenuse = Double.toString(legC);
        System.out.println("Hypotenuse equals " + legC);
        return legC; 
    }
}