class Chef extends Thread {

    String dish;
    int time;

    public Chef(String dish, int time) {
        this.dish = dish;
        this.time = time;
    }

    public void run() {

        System.out.println(
            Thread.currentThread().getName() +
            " started preparing " + dish
        );

        try {
            for (int i = 25; i <= 100; i += 25) {

                Thread.sleep(time * 250);

                System.out.println(
                    Thread.currentThread().getName() +
                    " preparing " + dish + ": " + i + "% complete"
                );
            }
        } 
        catch (Exception e) {}
    }
}

public class RestaurantDemo {

    public static void main(String[] args) throws Exception {

        Chef c1 = new Chef("Pizza", 3);
        Chef c2 = new Chef("Pasta", 2);
        Chef c3 = new Chef("Salad", 1);
        Chef c4 = new Chef("Burger", 2);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
