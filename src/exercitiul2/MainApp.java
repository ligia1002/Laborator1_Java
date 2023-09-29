package exercitiul2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        int nr=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        int sum=0;

        Scanner scanner=new Scanner(new File("in.txt"));


        while(scanner.has.Next())
        {
            int a=scanner.nextInt();
            if(a>max) max=a;
            if(a<min) min=a;
            sum+=a;
            nr=nr+1;
        }
       float media =sum/(float)nr;

        PrintStream flux_out;
        flux_out = new PrintStream ("out.txt");
        flux_out.println("media "+media );
        flux_out.println("\n" );
        flux_out.println("max "+max );
        flux_out.println("\n" );
        flux_out.println("min "+min );
    }
}
