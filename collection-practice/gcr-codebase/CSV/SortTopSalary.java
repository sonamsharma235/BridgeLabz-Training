package CSV;

import java.io.*;
import java.util.*;

class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SortTopSalary {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("src/CSV/employees.csv"));

        br.readLine();   // skip header

        List<Emp> list = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Emp(d[1], Double.parseDouble(d[3])));
        }

        // sort desc
        list.sort((a,b) -> Double.compare(b.salary, a.salary));

        System.out.println("Top 5 Highest Paid:");

        list.stream().limit(5)
            .forEach(e ->
                System.out.println(e.name + " - " + e.salary));
    }
}

