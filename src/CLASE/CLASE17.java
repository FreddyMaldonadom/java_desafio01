package CLASE;

import java.io.File;
import java.io.IOException;

public class CLASE17 {
    public static void main(String[] args) throws IOException{
        createDirectory ("directory");
    }
    public static void createDirectory(String dir) throws IOException{
        File directory = new File("src/"+dir);
        if (!directory.exists()) {
            directory.mkdir();
        }else{
            System.out.println("directory already exists");
        }
    }
}
