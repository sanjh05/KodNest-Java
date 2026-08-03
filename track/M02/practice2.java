public class practice2 {
    public static void main(String[] args){
       int completedTopics = 17;
       int totalTopics = 20;
       int dailyLearningHours = 3;
       int learningDays = 5;
       
       int remainingTopics = totalTopics - completedTopics;
       int weeklyLearning = learningDays * dailyLearningHours;
       double progressPercentage = (double) completedTopics * 100/totalTopics;

       System.out.println("completed Topics: " + completedTopics);
       System.out.println("Remaining Topics: " + remainingTopics);
       System.out.println("weekly Learning Hours: " + weeklyLearning);
       System.out.println("Progress Percentage: " + progressPercentage);

    }
}
