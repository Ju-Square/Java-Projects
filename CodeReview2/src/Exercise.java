public class Exercise {

    private String exercisesName;
    private String description;
    private int durationSec;
    private String position;

    public Exercise(String exercisesName, String description, int durationSec, String position){
        this.exercisesName = exercisesName;
        this.description = description;
        this.durationSec = durationSec;
        this.position = position;

    }
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

