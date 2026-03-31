class MobilePhone {
    String brand;
    String model;
    double price;
    void showDetails() {
        System.out.println( brand);
        System.out.println(model);
        System.out.println(price);
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "VIVO";
        m1.model = "VIVO V29";
        m1.price = 15999.0;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "ONE PLUS";
        m2.model = "ONE PLUS nord4";
        m2.price = 39999.0;

        MobilePhone m3 = new MobilePhone();
        m3.brand = "APPLE";
        m3.model = "iphone pro16";
        m3.price = 79999.0;

        m1.showDetails();
        m2.showDetails();
        m3.showDetails();
    }
}
