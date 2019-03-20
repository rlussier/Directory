package createdirectory;
import java.io.File;

public class Createdirectory {

    public static void main(String[] args) {
        File dir = new File("DemoDirectory");
        boolean isDirectoryCreated = dir.mkdir();
        if (isDirectoryCreated){
            System.out.println("successfully");}
        else{
            System.out.println("not");
        }
    }
    
}
