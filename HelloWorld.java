
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    
    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " and is less than 15");
            i++;
        }
        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " and is greater than 5");
            k--;
        }
        int a = 0;
        int b = 0;
        while (a < 10 && b <= 20) {
            System.out.println("b is " + b + " and is less than or equal to 20");
            System.out.println("a is " + a + " and is less than 10");
            b++;
            a++;
        }
    }
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


