package testx;

import org.junit.Test;

import java.io.*;

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

        System.out.println();
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            reader = new BufferedReader(isr);
            String data = reader.readLine();
            System.out.println(data);
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
    public void play3() throws FileNotFoundException {
        PrintStream print = new PrintStream(new FileOutputStream("hello.txt"));
        System.setOut(print);
        System.out.println("123");
    }

    @Test
    public void play4() {
        DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("int.txt"));
            dos.writeUTF("hello");
            dos.writeInt(15);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos != null)
                    dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void play5() {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("int.txt"));
            String name = dis.readUTF();
            int age = dis.readInt();
            System.out.println(name + " " + age);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(dis != null)
                    dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void play6(){
        String m = "hello";
        String substring = m.substring(1, 3);
        System.out.println(m + "\n" + substring);
    }
}
