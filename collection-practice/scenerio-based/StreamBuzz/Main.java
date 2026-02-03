    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program p = new Program();

        while (true) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    CreatorStats cs = new CreatorStats();

                    System.out.println("Enter Creator Name:");
                    cs.setCreatorName(sc.nextLine());

                    double[] likes = new double[4];

                    System.out.println(
                      "Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        likes[i] =
                          Double.parseDouble(sc.nextLine());
                    }

                    cs.setWeeklyLikes(likes);

                    p.registerCreator(cs);

                    System.out.println(
                      "Creator registered successfully");
                    break;

                case 2:
                    System.out.println(
                      "Enter like threshold:");

                    double threshold =
                      Double.parseDouble(sc.nextLine());

                    Map<String, Integer> map =
                        p.getTopPostCounts(
                            CreatorStats.engagementBoard,
                            threshold);

                    if (map.isEmpty()) {
                        System.out.println(
                          "No top-performing posts this week");
                    } else {
                        for (String name : map.keySet()) {
                            System.out.println(
                              name + " - " + map.get(name));
                        }
                    }
                    break;

                case 3:
                    double avg = p.calculateAverageLikes();

                    System.out.println(
                      "Overall average weekly likes: "
                      + avg);
                    break;

                case 4:
                    System.out.println(
                      "Logging off - Keep Creating with StreamBuzz!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
