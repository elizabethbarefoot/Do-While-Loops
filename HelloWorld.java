
/**
 * Write a description of class WhileLoops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HelloWorld
{
    
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        while (i > 15) {
            System.out.println("i is" + i + " but is less than 15");
            i++;
        }
    }

    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

