import java.io.IOException;

public class Shutdown {
    
    public static void main(String[] args) {
        
        try {
            //for shutdown
            Process process = Runtime.getRuntime().exec("shutdown -s -t 0");

            // For restart , you can use:"shutdown -r -t 0"

            // For aborting a shutdown, you can use :"shutdown -a"
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
