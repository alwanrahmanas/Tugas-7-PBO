import java.lang.Math;

public class Car implements Opsi{

    public double Calculate(double x, double y){

        return Math.abs(y-x);
    }

    public String GetName(){

        return "Car";
       }
}
