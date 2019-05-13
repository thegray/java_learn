package pbk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length > 0) {
            System.out.println(args[0]);
        }
        Consoles c = new Consoles();
        c.Run();
    }
}
