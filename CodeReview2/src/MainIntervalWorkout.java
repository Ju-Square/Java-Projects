public class MainIntervalWorkout {
    public static void main(String[] args) {
        IntervalWorkout[] intervalWorkout = getIntervalWorkout();

        for(int i = 0; i < intervalWorkout.length; i++){
            System.out.println(intervalWorkout[i].print());
        }
    }

    private static IntervalWorkout[] getIntervalWorkout(){
        IntervalWorkout round1 = new IntervalWorkout("\nPush-ups\n" +
                "Squats\n" +
                "Planks\n", 30);
        return new IntervalWorkout[]{round1};
    }
}
