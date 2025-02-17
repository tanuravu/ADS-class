import java.util.*;

public class methodloading {
    static int  Mutliply(int a,int b ){
        return a*b;
    }
    static double Multiply(double a, double b){
        return a*b;
    }
}
class method{
    public static void main(String[] args) {
        System.out.println(methodloading.Multiply(2, 4));
        System.out.println(methodloading.Multiply(5.5, 6.3));
    }
}
