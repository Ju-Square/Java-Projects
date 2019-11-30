public class IntervalWorkout {
    public static void main(String[] args) {
        String[] severalExercises = new String[]{"Push-ups", "Squats", "Planks"};
        String[] numbOfReps = new String[]{"Round 1", "Round 2", "Round 3", "Round 4"};
        int breaktime = 30;

        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");

        for (int i = 0; i < numbOfReps.length; i++) {
            System.out.println("=============================");
            System.out.println(numbOfReps[i]);
            for (int j = 0; j < severalExercises.length; j++) {
                System.out.println(severalExercises[j]);
            }
            if (i != 3) {
                System.out.println("=============================");
                System.out.println("DO THE BREAK (" + breaktime + " SECONDS)");
            }
        }

        System.out.println("\n");
        System.out.println("*****************************");
        System.out.println("CONGRATS - YOU ARE DONE !!!");
        System.out.println("*****************************");


    }
}

