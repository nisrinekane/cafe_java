public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        //Create 3 more drink price variables, for drip coffee, latte and cappuccino following the camel case naming convention.
        double mochaPrice = 3.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Lee";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        //Noah
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage + " " + displayTotalMessage + cappuccinoPrice);
        }
        //Lee
        if (isReadyOrder2) {
            System.out.println(customer4 + readyMessage + " " + displayTotalMessage + lattePrice * 2);
        } else {
            System.out.println(customer4 + pendingMessage);
        }
        //Jimmy
        if (isReadyOrder3) {
            System.out.println(customer4 + readyMessage + " " + displayTotalMessage + (lattePrice - mochaPrice));
        }
    }
}