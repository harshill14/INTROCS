public class PolygonTransform {
    public static double[] copy(double[] array) {
        double [] arr2 = new double[array.length];
        for (int i = 0; i<array.length; i++){
            arr2[i]=array[i]; 
        }
    return arr2;
    }

    public static void scale(double[] x, double[] y, double alpha) {
        for (int i = 0; i<x.length; i++){
            x[i] = alpha * x[i];
            y[i] = alpha * y[i];
        }
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        for (int i = 0; i<x.length; i++){
            x[i] = dx + x[i];
            y[i] = dy + y[i];
        }
    }

    public static void rotate(double[] x, double[] y, double angle) {
        angle = Math.toRadians(angle);
            for(int i = 0; i<x.length;i++){
                double newX=(x[i]*Math.cos(angle))-(y[i]*Math.sin(angle));
                double newY=(y[i]*Math.cos(angle))+(x[i]*Math.sin(angle));
                x[i]=newX;
                y[i]=newY;
            }
            
    
    }

    public static void main(String[] args) {
        
    }
}
