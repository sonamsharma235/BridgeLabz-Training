package CSV;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MergeCSV {

    public static void main(String[] args) throws Exception {

        String f1 = "src/CSV/students1.csv";
        String f2 = "src/CSV/students2.csv";
        String out = "src/CSV/merged.csv";

        BufferedReader br1 = new BufferedReader(new FileReader(f1));
        BufferedReader br2 = new BufferedReader(new FileReader(f2));

        Map<String, String> map = new HashMap<>();

        br1.readLine();
        br2.readLine();

        String line;

        // read second file into map
        while ((line = br2.readLine()) != null) {
            String[] d = line.split(",");
            map.put(d[0], d[1] + "," + d[2]);
        }

        FileWriter fw = new FileWriter(out);
        fw.write("ID,Name,Age,Marks,Grade\n");

        // merge with first file
        while ((line = br1.readLine()) != null) {

            String[] d = line.split(",");

            if (map.containsKey(d[0])) {
                fw.write(line + "," + map.get(d[0]) + "\n");
            }
        }

        fw.close();
        br1.close();
        br2.close();

        System.out.println("Merged Successfully!");
    }
}

