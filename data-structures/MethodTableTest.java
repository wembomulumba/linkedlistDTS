package Programming;

import sun.rmi.rmic.iiop.CompoundType;

import java.lang.reflect.Method;

public class MethodTableTest {

    // get method pointers to the square and sqrt Exception

    public static void main(String[] args) throws Exception {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);

        // print tables of x and y-values

        printTable(1,25,10, square);
        printTable(1,25,10,sqrt);
    }

    public static double square(double x) {
        return x * x;
    }

    public static void printTable(double from, double to, int n, Method f) {
        // pirnt out the method as table header
        System.out.println(f);

        double dx = (to-from) / (n - 1);

        for (double x = from; x <= to; x +=dx) {
            try {
                double y = (Double) f.invoke(null, x);
                System.out.println(x);
                System.out.println(y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
