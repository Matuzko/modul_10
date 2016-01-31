package lecture10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;

        try {
            reader = new FileReader("first.txt");
            writer = new FileWriter("outfile.txt");

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(caesar((char) c, true));
            }


        }catch (FileNotFoundException ex){
            System.out.println("Put the input "+ex.getMessage()+" file in public directory");
        }
        finally {
            if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }
        }


    }

    public static char caesar(char name, boolean needToCrypt) {

        if (needToCrypt = true) {

            if (name >= 'd' && name <= 'z') name -= 3;
            else if (name >= 'D' && name <= 'Z') name -= 3;
            else if (name >= 'a' && name <= 'c') name += 23;
            else if (name >= 'A' && name <= 'C') name += 23;

        } else if (needToCrypt = false) {

            if (name >= 'x' && name <= 'z') name -= 23;
            else if (name >= 'X' && name <= 'Z') name -= 23;
            else if (name >= 'a' && name <= 'w') name += 3;
            else if (name >= 'A' && name <= 'W') name += 3;

        }
        return name;
    }
}


