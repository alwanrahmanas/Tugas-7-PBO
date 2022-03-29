import java.lang.Math;

public class Train implements Opsi{

    public double Calculate(double x, double y){

        return Math.abs(y-x);
    }

    public String GetName(){

        return "Kereta";
       }
}
