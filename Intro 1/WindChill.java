/*
 *  Author@ Harshil Patel
 *  % java WindChill 35.0 10.0
 *  27.445420765619037
 *
 * Formula is not valid if T is larger than 50 in absolute value or if 
 *  v is larger than 120 or less than 3.
 *  Assume the inputs are valid values
*/

public class WindChill {

    public static void main(String[] args) {

    double T = Double.parseDouble (args[0]);
    double v = Double.parseDouble (args[1]);
    double w = 35.74 + .6215 * T + (.4275 * T - 35.75) * Math.pow (v, .16);
    System.out.println("Wind Chill= " +w);
    
    }
}
