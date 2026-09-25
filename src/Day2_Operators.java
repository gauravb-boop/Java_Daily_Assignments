public class Day2_Operators {

    public static void main(String[] args){
        double a = 3.09;
        float b = 1.5f;
        double c;

         System.out.println(c = a + b);
        System.out.println(c = a - b);
        double y = a++ + ++b;
        double x = ++a + ++b;
        System.out.println(y);
        System.out.println(x);
    }
}
