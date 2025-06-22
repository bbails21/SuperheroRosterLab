public class SuperheroRoster {

    public static void main(String[] args) {
        // Step 1: Create an array of Superhero objects
        Superhero[] heroes = {
            new Superhero("Spider-Man", "Web-slinging", 85),
            new Superhero("Iron Man", "High-tech armor", 90),
            new Superhero("Black Widow", "Stealth and combat", 80)
        };

        // Step 2: Display each hero
        System.out.println("Marvel Superhero Roster:");
        for (Superhero hero : heroes) {
            hero.displayHero();
        }

        // Step 3: Search for a specific hero
        System.out.println("\nSearch Results:");
        searchHero(heroes, "Iron Man");

        // Step 4: Calculate and display average power level
        double average = calculateAveragePower(heroes);
        System.out.println("\nAverage Power Level: " + average);
    }

    // Method: searchHero
    public static void searchHero(Superhero[] heroes, String target) {
        boolean found = false;
        for (Superhero hero : heroes) {
            if (hero.name.equalsIgnoreCase(target)) {
                hero.displayHero();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    // Method: calculateAveragePower
    public static double calculateAveragePower(Superhero[] heroes) {
        int sum = 0;
        for (Superhero hero : heroes) {
            sum += hero.powerLevel;
        }
        return (double) sum / heroes.length;
    }
}