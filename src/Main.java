public class Main {
    public static void main(String[] args) {

        // Creating a new object using class MobilePhone.
        MobilePhone phone = new MobilePhone("200g", 700);

        phone.displayValues();

        String parameters = phone.getParameters();
        System.out.print("\nParameters method getParameters: " + parameters);

        int price = phone.getPrice();
        System.out.print("\nPrice from method getPrice: " + price);

        double discountedPrice = phone.discountBy10Percent();
        System.out.print("\nPrice from method discountBy10Percent: " + discountedPrice);

        int newPrice = phone.newPrice(5);
        System.out.print("\nPrice from method newPrice: " + newPrice);


    }
}

class MobilePhone {
    String weight;
    int price;

    public MobilePhone(String weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public void displayValues() {
        System.out.print("\nWeight of this phone is: " + this.weight
                + "\nPrice of this phone is: " + this.price);
    }

    // Return parameters as one string.
    public String getParameters() {
        return this.weight + " " + this.price;
    }

    // Return argument price as an int.
    public int getPrice() {
        return this.price;
    }

    //Discount price by 10 %.
    public double discountBy10Percent() {
        return this.price * 0.9;
    }

    //Multiply price by user number.
    public int newPrice(int number) {
        return this.price * number;
    }

}