package CSV;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicate {

    public static void main(String[] args) throws Exception {

        String file = "src/CSV/students.csv";

        BufferedReader br = new BufferedReader(new FileReader(file));

        Set<String> ids = new HashSet<>();

        br.readLine();   // skip header

        String line;

        System.out.println("Duplicate Records:");

        while ((line = br.readLine()) != null) {

            String id = line.split(",")[0];

            if (!ids.add(id)) {
                System.out.println(line);
            }
        }

        br.close();
    }
}

