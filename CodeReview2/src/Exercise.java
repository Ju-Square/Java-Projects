public class Exercise { //Taks 1

    private String exercisesName;
    private String description;
    private int durationSec;
    private String position;

    public Exercise(String exercisesName, String description, int durationSec, String position){
        //Task 2
        this.exercisesName = exercisesName;
        this.description = description;
        this.durationSec = durationSec;
        this.position = position;

    }
    //Task 3
    public String print(){
        String printOut = "";
        printOut+=getExercisesName()+ "       DURATION: " +getDurationSec()+ " seconds.\n";
        printOut+="------------------------------------------------------------------\n";
        printOut+="DESCRIPTION: " +getDescription()+ "\n";

        return printOut;
    }

    public String getExercisesName(){
        return exercisesName;
    }

     public String getDescription(){
        return description;
     }

     public int getDurationSec(){
        return durationSec;
     }

     public String getPosition(){
        return position;
     }
}

