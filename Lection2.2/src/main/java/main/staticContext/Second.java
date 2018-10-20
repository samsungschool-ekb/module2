package main.staticContext;

/**
 * Created by teacher-pc on 13.10.2018.
 */
public class Second {
    private int a;
    private static int b;

    public Second(){
        a++;
        b++;
        System.out.printf("a:%d,b:%d%n", a, b);
    }
}
