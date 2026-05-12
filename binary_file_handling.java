import java.io.*;
public class Main {
    public static void main(String[] args)
            throws Exception {
        File folder =
            new File("JavaFolder");
        folder.mkdir();
        FileOutputStream fos =
            new FileOutputStream(
                "JavaFolder/file.txt");
        DataOutputStream dos =
            new DataOutputStream(fos);
        dos.writeUTF("ID Name Marks");
        dos.writeInt(21);
        dos.writeUTF("Amulya R");
        dos.writeInt(95);
        dos.close();
        System.out.println("Data Stored!!!");
        FileInputStream fis =
            new FileInputStream(
                "JavaFolder/file.txt");

        DataInputStream dis =
            new DataInputStream(fis);


        System.out.println(dis.readUTF());

        System.out.println(dis.readInt());

        System.out.println(dis.readUTF());

        System.out.println(dis.readInt());

        dis.close();
    }
}
