public class IntervalWorkout {

    private String severalExercises;
    private int breaktime;

    public IntervalWorkout(String severalExercises, int breaktime){
        this.severalExercises = severalExercises;
        this.breaktime = breaktime;
    }
    public String print(){
        String printInterval = "";
        printInterval+="********************************\n";
        printInterval+="Interval Workout STARTS !!!!\n";
        printInterval+="********************************\n";
        printInterval+="================================\n";
        printInterval+="ROUND 1";
        printInterval+=getSeveralExercises();
        printInterval+="================================\n";
        printInterval+="DO THE BREAK ("+getBreaktime()+")\n";
        printInterval+="================================\n";
        printInterval+="ROUND 2";
        printInterval+=getSeveralExercises();
        printInterval+="================================\n";
        printInterval+="DO THE BREAK ("+getBreaktime()+")\n";
        printInterval+="================================\n";
        printInterval+="ROUND 3";
        printInterval+=getSeveralExercises();
        printInterval+="================================\n";
        printInterval+="DO THE BREAK ("+getBreaktime()+")\n";
        printInterval+="================================\n";
        printInterval+="ROUND 4";
        printInterval+=getSeveralExercises();
        printInterval+="================================\n";
        printInterval+="DO THE BREAK ("+getBreaktime()+")\n";
        printInterval+="================================\n";
        printInterval+="\n";
        printInterval+="\n";
        printInterval+="\n";
        printInterval+="********************************\n";
        printInterval+="CONGRATS - YOU ARE DONE !!!\n";
        printInterval+="********************************";

        return printInterval;
    }

    public String getSeveralExercises(){
        return severalExercises;
    }
    public int getBreaktime(){
        return breaktime;
    }
}
