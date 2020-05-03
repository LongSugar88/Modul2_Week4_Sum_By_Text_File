import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader_File_Example {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException("File not found");
            }
            FileReader myFile = new FileReader(file);
            BufferedReader  buff  = new BufferedReader(myFile);
            String content = "";
            int sum = 0;
            while ( (content = buff.readLine()) != null){
                System.out.println(content);
                sum += Integer.parseInt(content);
            }
            buff.close();
            System.out.println("Sum: " + sum);
        }
        catch (Exception e){
            System.err.println("File does not exist or error ");
        }

    }
}
