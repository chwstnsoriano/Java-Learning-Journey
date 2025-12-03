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
        char favoriteCryptoInitial = 'B';

        System.out.println("\n--- CHAR VALUES ---");
        System.out.println("First initial: " + firstInitial);
        System.out.println("Shirt size: " + shirtSize);
        System.out.println("Favorite crypto initial: " + favoriteCryptoInitial);

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

        // STRING
        String name = "Christian";
        String favoriteCrypto = "Bitcoin";
        String currentMood = "Motivated";
        String favoriteSport = "Basketball";
        String dailyGoal = "Study Java";

        System.out.println("\n--- STRING VALUES ---");
        System.out.println("Name: " + name);
        System.out.println("Favorite crypto: " + favoriteCrypto);
        System.out.println("Current mood: " + currentMood);
        System.out.println("Favorite sport: " + favoriteSport);
        System.out.println("Daily goal: " + dailyGoal);

        //EXERCISE
        System.out.println("\n--- DAILY SUMMARY ---");

        // Combine name, age, and mood
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. Today I feel " + currentMood + ".");

        // Fitness info
        System.out.println("I ran " + numberOfRunsThisWeek + " times this week, covering " + lastRunDistanceKm + " km in my last run.");
        System.out.println("I walked " + stepsToday + " steps today and did " + workoutsThisWeek + " workouts this week.");
        System.out.println("My body weight is " + bodyWeightKg + " kg and my height is " + heightMeters + " m.");

        // Crypto / trading
        System.out.println("My favorite crypto is " + favoriteCrypto + " (" + favoriteCryptoInitial + ") and I made $" + cryptoProfitToday + " today from trading.");

        // Daily goals / habits
        if (studyingJava) {
            System.out.println("Studied Java today ✅");
        } else {
            System.out.println("Did not study Java ❌");
        }

        if (ranToday) {
            System.out.println("Ran today ✅");
        } else {
            System.out.println("Did not run today ❌");
        }

        if (stayedSoberToday) {
            System.out.println("Stayed sober today ✅");
        } else {
            System.out.println("Did not stay sober ❌");
        }

        if (workoutCompleted) {
            System.out.println("Workout completed ✅");
        } else {
            System.out.println("Workout not done ❌");
        }

        if (profitableTradingDay) {
            System.out.println("Profitable trading day ✅");
        } else {
            System.out.println("No profit today ❌");
        }

        if (sleptEnough) {
            System.out.println("Slept enough ✅");
        } else {
            System.out.println("Did not sleep enough ❌");
        }

        // Personal details
        System.out.println("Shirt size: " + shirtSize + " | Favorite Sport: " + favoriteSport + " | First Initial: " + firstInitial);

    }

}
