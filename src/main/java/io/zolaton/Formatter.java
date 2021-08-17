package io.zolaton;

/**
 * Hello world!
 *
 */
public class Formatter 
{
    public static void main(String[] args)
    {
        System.out.println(new Formatter().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name + " from Formatter";
    }
}
