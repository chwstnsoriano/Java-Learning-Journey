public class Main {
    public static void main(String[] args) {

        //Learning variables

        //ABOUT ME

        //Int
        int age = 22;
        int numberOfRunsThisWeek = 2;
        int stepsToday = 10000;
        int workoutsThisWeek = 5;
        int totalTradesThisWeek = 5;

        System.out.println("--- INT VALUES ---");
        System.out.println("My age is " + age + " years old");
        System.out.println("I ran " + numberOfRunsThisWeek + " times this week");
        System.out.println("I did " + stepsToday + " steps today");
        System.out.println("I did " + workoutsThisWeek + " workouts this week");
        System.out.println("Total trades for this week " + totalTradesThisWeek + " trades");

        //Double
        double bodyWeightKg = 52.5;
        double heightMeters = 1.65;
        double lastRunDistanceKm = 5.5;
        double sleepHours = 6.5;
        double cryptoProfitToday = 278.7;

        System.out.println("\n--- DOUBLE VALUES ---");
        System.out.println("Body weight: " + bodyWeightKg + " kg");
        System.out.println("Height: " + heightMeters + " m");
        System.out.println("Last run distance: " + lastRunDistanceKm + " km");
        System.out.println("Sleep hours: " + sleepHours);
        System.out.println("Crypto profit today: $" + cryptoProfitToday);


        //Char
        char firstInitial = 'C';
        char shirtSize = 'L';
        char favoriteCrypto = 'X';

        System.out.println("\n--- CHAR VALUES ---");
        System.out.println("First initial: " + firstInitial);
        System.out.println("Shirt size: " + shirtSize);
        System.out.println("Favorite crypto initial: " + favoriteCrypto);

        //Boolean
        boolean studyingJava = true;
        boolean ranToday = true;
        boolean stayedSoberToday = true;
        boolean workoutCompleted = true;
        boolean profitableTradingDay = true;
        boolean sleptEnough = true;

        System.out.println("\n--- BOOLEAN CHECKS ---");

        if (studyingJava) {
            System.out.println("Good job studying Java today!");
        } else {
            System.out.println("You need to study Java today.");
        }

        if (ranToday) {
            System.out.println("You completed your run today!");
        } else {
            System.out.println("Go for a run today.");
        }

        if (stayedSoberToday) {
            System.out.println("You stayed disciplined today!");
        } else {
            System.out.println("Stay strong and avoid drinking.");
        }

        if (workoutCompleted) {
            System.out.println("Workout finished today!");
        } else {
            System.out.println("Workout still needs to be done.");
        }

        if (profitableTradingDay) {
            System.out.println("Trading was profitable today!");
        } else {
            System.out.println("No profit today — learn and improve.");
        }

        if (sleptEnough) {
            System.out.println("You got enough sleep!");
        } else {
            System.out.println("Try to sleep more tonight.");
        }

    }

}
