package CSV;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
          new BufferedReader(new FileReader("src/CSV/sample.csv"));

        br.readLine();

        String emailRegex =
          "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Pattern p = Pattern.compile(emailRegex);

        String line;
        while ((line = br.readLine()) != null) {

            String[] d = line.split(",");

            boolean emailValid =
                p.matcher(d[2]).matches();

            boolean phoneValid =
                d[3].matches("\\d{10}");

            if (!emailValid || !phoneValid) {
                System.out.println("Invalid Row: " + line);
            }
        }
    }
}

