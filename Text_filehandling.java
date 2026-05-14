import java.io.*;

public class Main {

    public static void main(String[] args)
            throws Exception {

        // Create Folder
        File folder =
            new File("JavaFolder");

        folder.mkdir();


        // Create File
        File file =
            new File("JavaFolder/data.txt");

        file.createNewFile();


        // Write into File
        FileWriter fw =
            new FileWriter(file);

        fw.write("Hello Java");

        fw.close();

        System.out.println("Data Written");


        // Read File
        BufferedReader br =
            new BufferedReader(
                new FileReader(file));

        String line;

        while((line = br.readLine()) != null) {

            System.out.println(line);
        }

        br.close();


        // Copy into Another File
        FileWriter fw2 =
            new FileWriter(
                "JavaFolder/copy.txt");

        fw2.write("Hello Java");

        fw2.close();

        System.out.println("File Copied");
    }
}
