/*
 *  Author@ Harshil Patel
 * % java OrderCheck 5 10 15 2
 false
 * % java OrderCheck 15 11 9 4
 true
*/
public class OrderCheck {

    public static void main(String[] args) {
    
        int w = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int z = Integer.parseInt(args[3]);
    
        boolean val = ((w < x) && ( x <y ) && (y<z)) || ((w> x) && (x>y)&& (y>z));
        
        System.out.println(val); 
    }
}
