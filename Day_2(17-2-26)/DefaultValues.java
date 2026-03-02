public class DefaultValues {

    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    public static void main(String[] args) {

        DefaultValues obj = new DefaultValues();

        System.out.println("byte a = " + obj.a);
        System.out.println("short b = " + obj.b);
        System.out.println("int c = " + obj.c);
        System.out.println("long d = " + obj.d);
        System.out.println("float e = " + obj.e);
        System.out.println("double f = " + obj.f);
        System.out.println("char g = " + obj.g);
        System.out.println("boolean h = " + obj.h);
    }
}