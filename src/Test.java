import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter file link: ");
        Scanner scan = new Scanner(System.in);
        String link = scan.nextLine();

        Reader_File_Example readFile = new Reader_File_Example();
        readFile.readFileText(link);
    }
}
