/*
 *  Author@ Harshil Patel
 * java LargestOfFive 17 23 5 1 6
 * 23 
 * java LargestOfFive 8 3 -8 4 1
 * 8
*/
public class LargestOfFive {

    public static void main(String[] args) {
    
        int v = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);
        int z = Integer.parseInt(args[4]);
        
        if (v>w && v>x && v>y && v>z)
        {
            System.out.println(v);
        }
        else if (w>v && w>x && w>y && w>z)
        {
            System.out.println(w);
        }
        else if (x>v && x>w && x>y && x>z)
        {
            System.out.println(x);
        }
        else if (y>v && y>w && y>x && y>z)
        {
            System.out.println(y);
        }
        else
        {
            System.out.println(z);
        }
    }
}
