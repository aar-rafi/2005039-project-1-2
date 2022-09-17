import java.awt.image.BufferStrategy;
import java.io.*;

public class Main {

    public static void main(String[] args)  {
        System.out.println("Hello world!");
        int i=1;
        try {
            BufferedReader br, br1;
            BufferedWriter wr;
            br = new BufferedReader(new FileReader("G:\\moviepics\\movies.txt"));
            br1 = new BufferedReader(new FileReader("G:\\moviepics\\thumbnail_Links.txt"));
            wr = new BufferedWriter(new FileWriter("G:\\moviepics\\Newmovies.txt"));
            String s,s1;
            while (true) {
                s=br.readLine();
               s1 = br1.readLine();
                wr.write(i + "," + s + "," + s1);
                wr.write(System.lineSeparator());
                i++;
            }
            }catch(IOException e){
                throw new RuntimeException(e);
        }

    }
}