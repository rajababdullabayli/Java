package OOP.ClassTasks.Task_2;

public class Main {
    static void main(String[] args) {
        QuizPlayer qp1 = new QuizPlayer("Rajab", "QUIZ-01", 2008);
        QuizPlayer qp2 = new QuizPlayer("Rasul", "QUIZ-02", 2009);
        QuizPlayer qp3 = new QuizPlayer("Murad", "QUIZ-03", 2007);
        qp1.submitAnswer(20);
        qp1.submitAnswer(15);
        qp1.submitAnswer(10);
        qp1.submitAnswer(30);
        qp1.submitAnswer(25);

        qp2.submitAnswer(50);
        qp3.submitAnswer(40);

        System.out.println("Rajab's ");
        qp1.checkScore(2008);
        System.out.println("Resul's ");
        qp1.checkScore(2009);
        System.out.println("Murad's ");
        qp1.checkScore(2007);

        qp1.shareBonusPoints(qp2, 40, 2009);

        System.out.println("Rajab's new ");
        qp1.checkScore(2008);
        System.out.println("Resul's new ");
        qp2.checkScore(2009);

        qp2.checkScore(9999);

        boolean hintResult = qp3.useHint(100, 2007);
        System.out.println("Did you get the hint?: " + hintResult);
        System.out.println("Murad's final ");
        qp3.checkScore(2007);

        qp1.printLog();
    }
}
