public class Main {
    public static void main(String[] args) {

        // Creating a new object using class MobilePhone.
        /*MobilePhone phone = new MobilePhone("200g", 700);
        MobilePhone oldPhone = new MobilePhone("4000g", 100);
        MobilePhone mediumPhone = new MobilePhone("600g", 340);

        phone.displayValues();

        String parameters = phone.getParameters();
        System.out.print("\nParameters method getParameters: " + parameters);

        int price = phone.getPrice();
        System.out.print("\nPrice from method getPrice: " + price);

        double discountedPrice = phone.discountBy10Percent();
        System.out.print("\nPrice from method discountBy10Percent: " + discountedPrice);

        int newPrice = phone.newPrice(5);
        System.out.print("\nPrice from method newPrice: " + newPrice);

        phone.checkPrice();
        oldPhone.checkPrice();
        mediumPhone.checkPrice();
        */

        // Other tasks/exercises
        MobilePhone otherTasks = new MobilePhone("100g", 1000);
        otherTasks.displayEvenNumbers(17, 33);
        otherTasks.isDivided(1,11);
        System.out.println("Sum: " + otherTasks.getEvenSum(5, 9));
        otherTasks.getNumber(15, -3);
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

    public void checkPrice() {
        if (this.price < 200) {
            System.out.println("Price is very good.");
        } else if (this.price <300){
            System.out.println("Price is good.");
        } else if (this.price <550) {
            System.out.println("Price could be lower.");
        } else {
                System.out.println("This phone is too expensive.");
        }
    }
    public void displayEvenNumbers(int min, int max){
        for(int i=min; i<=max; i++){
            if(i%2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    public void isDivided(int min, int max) {
        System.out.println("\nNumbers form range " + min + ":" + max + " divided by 3: ");
        for(int i=min; i <= max; i++) {
            if (i%3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nNumbers form range " + min + ":" + max + " divided by 5: ");
        for(int i=min; i <= max; i++) {
            if (i%5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public int getEvenSum(int min, int max){
        System.out.println("\nSum of numbers in range " + min + ":" + max + " divided by 2: ");
        int x = 0;
        for(int i=min; i <= max; i++) {
            if (i%2 == 0) {
                x += i;
            }
        }
        return x;
    }
    public void getNumber(int min, int max){
        int  helpFlag = 0;
        if (max < min){
            helpFlag = min;
            min = max;
            max = helpFlag;
        }
        for(int i=max; i>=min; i--){
            System.out.print(i + " ");
        }
    }
}