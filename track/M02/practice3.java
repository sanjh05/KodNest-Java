public class practice3 {
    public static void main(String[] args) {
        int solvedProblems = 47;
        int practiceDays = 5;
        double exactPercentage = 86.75;

        double widen = solvedProblems;
        int narrow = (int) exactPercentage;
        double average = (double) solvedProblems/practiceDays;
        boolean dailyTargetReach = average >= 9.0;

        System.out.println("Report Value: " + widen);
        System.out.println("Whole Percentage: " + narrow);
        System.out.println("Average Per Day: " + average);
        System.out.println("Daily Target Reached: "+ dailyTargetReach);
        
    }
}
