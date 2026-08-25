package OOP.ClassTasks.Task_2;

import java.util.ArrayList;

public class QuizPlayer {
    private String playerName;
    private String quizId;
    private int score;
    private int accessCode;
    private boolean isDisqualified;
    private int wrongCode;
    private ArrayList<String> quizLog;

    public QuizPlayer(String playerName, String quizId, int accessCode) {
        this.playerName = playerName;
        this.quizId = quizId;
        this.score = 0;
        this.isDisqualified = false;
        this.wrongCode = 0;
        this.quizLog = new ArrayList<>();
        if (accessCode>=1000 && accessCode<=9999){
            this.accessCode = accessCode;
        }else {
            System.out.println("This code must be a 4-digit code. Default code: 1234");
            this.accessCode = 1234;
        }
    }

    public void submitAnswer(int points){
        if(points<0){
            System.out.println("Points mustn't be negative ");
        }else if (points>0){
            score+=points;
            quizLog.add("This Submit Score : "+score);
        }
    }

    public boolean useHint(int cost, int enteredCode){
        if(accessCode == enteredCode){
            if (score>=cost){
                score-=cost;
                quizLog.add("Use Hint Score: "+score);
                return true;
            }else {
                System.out.println("Score must be great than cost");
                return false;
            }
        }else {
            System.out.println("Code is not true");
            return false;
        }
    }

    public void checkScore(int enteredCode){
        if (accessCode == enteredCode){
            System.out.println("Score: "+score);
        }else {

            System.out.println("Incorrect code!");
        }
    }

    public void shareBonusPoints(QuizPlayer receiver, int amount, int enteredCode){
        if(accessCode == enteredCode){
            if (amount > 0 && score > amount){
                score -= amount;
                receiver.score += amount;
                quizLog.add("Change reverse score: "+score);
            }
        }else {
            wrongCode++;
            if (wrongCode == 3){
                disqualifyPlayer();
            }
        }
    }

    public void disqualifyPlayer(){
        isDisqualified = true;
    }

    public void printLog(){
        for (String print : quizLog){
            System.out.println(print);
        }
    }
}
