package ohtu;

public class Submission {
    
    private int week;
    private int[] exercises;
    private int hours;
    private String course;
    

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }
    
    public void setExercises(int[] tehtt) {
        this.exercises = tehtt;
    }
    public void setHours(int tunn) {
        this.hours = tunn;
    }
    public String getExercises() {
        String res="";
        for (int i=0; i<this.exercises.length; i++) {
            res+=this.exercises[i]+", ";
        }
        return res;
    }
    public int getHours() {
        return this.hours;
    }
    public void setCourse(String kurssi) {
        this.course = kurssi;
    }
    public String getCourse() {
        return this.course;
    }

    @Override
    public String toString() {
        return "Kurssin "+course+" viikolla "+week+" opiskelija teki tehtävät "+getExercises()+" aikaa kului "+hours+" tuntia.";
    }
    
}