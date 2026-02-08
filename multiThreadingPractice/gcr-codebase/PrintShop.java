class PrintJob implements Runnable {

    String name;
    int pages;
    int priority;

    public PrintJob(String n, int p, int pr) {
        name = n;
        pages = p;
        priority = pr;
    }

    public void run() {

        for (int i = 1; i <= pages; i++) {

            try {
                Thread.sleep(100);
            } catch(Exception e){}

            System.out.println(
                "[" + Thread.currentThread().getPriority() +
                "] Printing " + name +
                " - Page " + i + " of " + pages
            );
        }
    }
}

public class PrintShop {

    public static void main(String[] args) {

        Thread j1 = new Thread(new PrintJob("Job1",10,5));
        Thread j2 = new Thread(new PrintJob("Job2",5,8));
        Thread j3 = new Thread(new PrintJob("Job3",15,3));
        Thread j4 = new Thread(new PrintJob("Job4",8,6));
        Thread j5 = new Thread(new PrintJob("Job5",12,7));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        long start = System.currentTimeMillis();

        j1.start(); j2.start(); j3.start(); j4.start(); j5.start();

        try {
            j1.join(); j2.join(); j3.join(); j4.join(); j5.join();
        } catch(Exception e){}

        long end = System.currentTimeMillis();

        System.out.println(
            "All jobs completed in " + (end-start) + "ms"
        );
    }
}
