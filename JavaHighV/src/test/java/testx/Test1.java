package testx;

import org.junit.Test;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {

    @Test
    public void play1() {
        FileReader reader = null;
        try {
            File file = new File("hello.txt");
            reader = new FileReader(file);
            int data;
            while ((data = reader.read()) != -1){
                System.out.println(data);
            }
//            int len;
//            char[] chars = new char[5];
//            while ((len = reader.read(chars)) != -1){
//                String word = new String(chars,0,len);
//                System.out.print(word);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(reader != null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void play2() throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(new File("hello.txt"));
            writer = new FileWriter(new File("hellox.txt"),true);
            char[] chars = new char[5];
            int len;
            while((len = reader.read(chars)) != -1){
                writer.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader != null)
                reader.close();
            if(writer != null)
                writer.close();
        }
    }
}
