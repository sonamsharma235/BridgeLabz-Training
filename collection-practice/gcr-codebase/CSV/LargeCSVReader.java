package CSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class LargeCSVReader {

    public static void main(String[] args) throws Exception {

        String file = "src/CSV/big.csv";

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        int count = 0;
        int total = 0;

        br.readLine();   // skip header

        while ((line = br.readLine()) != null) {

            count++;
            total++;

            // process block of 100 lines
            if (count == 100) {
                System.out.println("Processed: " + total);
                count = 0;
            }
        }

        System.out.println("Total Records Processed: " + total);

        br.close();
    }
}
