/*
 *  Author@ Harshil Patel
 * java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 * 0.3
 * 1.1
 * java TwoSmallest 1.0 35.0 2.0 1.1 6.9 0.3 0.3 6.7
 * 0.3
 * 0.3
*/
public class TwoSmallest {
    public static void main(String[] args) {
    
        double a = Double.MAX_VALUE;
        double b = Double.parseDouble(args[0]);
        for(int j = 0; j < args.length; j++){
            double c = Double.parseDouble(args[j]);
            if(c <= a){
                double temp = a;
                a = c;
                b = temp;

            }
            else if (c > a && c < b){
                b = c;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}
