import java.util.*;

class Version {
    String name;
    int size;

    Version(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

public class FileSystem {
    static Map<String, List<Version>> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String[] input = sc.nextLine().split(" ");
            String cmd = input[0];

            if (cmd.equals("UPLOAD")) {
                String file = input[1];
                String ver = input[2];
                int size = Integer.parseInt(input[3]);

                map.putIfAbsent(file, new ArrayList<>());

                boolean exists = false;
                for (Version v : map.get(file)) {
                    if (v.name.equals(ver)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    map.get(file).add(new Version(ver, size));
                }

            } else if (cmd.equals("FETCH")) {
                String file = input[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<Version> list = new ArrayList<>(map.get(file));

                list.sort((a, b) -> {
                    if (a.size != b.size)
                        return a.size - b.size;
                    return a.name.compareTo(b.name);
                });

                for (Version v : list) {
                    System.out.println(file + " " + v.name + " " + v.size);
                }

            } else if (cmd.equals("LATEST")) {
                String file = input[1];

                if (!map.containsKey(file) || map.get(file).isEmpty()) {
                    System.out.println("File Not Found");
                    continue;
                }

                Version v = map.get(file).get(map.get(file).size() - 1);
                System.out.println(file + " " + v.name + " " + v.size);

            } else if (cmd.equals("TOTAL_STORAGE")) {
                String file = input[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                int sum = 0;
                for (Version v : map.get(file)) {
                    sum += v.size;
                }

                System.out.println(file + " " + sum);
            }
        }
    }
}