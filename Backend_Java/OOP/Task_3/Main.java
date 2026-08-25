package OOP.ClassTasks.Task_3;

public class Main {
    static void main(String[] args) {
        TeamMember teamMember1 = new TeamMember("Rajab", "1", 2008);
        TeamMember teamMember2 = new TeamMember("Resul", "2", 2345);
        TeamMember teamMember3 = new TeamMember("Rajab", "1", 3456);

        teamMember1.assignTask("Solve Math");
        teamMember2.assignTask("Solve Physics");
        teamMember3.assignTask("Solve Code");

        teamMember3.reassignTask(teamMember1, "Solve Code", 3456);

        teamMember2.checkWorkload(2008);

        teamMember1.completeTask("Solve Math", 2008);

        teamMember2.assignTask("Solve A ");
        teamMember2.assignTask("Solve B ");
        teamMember2.assignTask("Solve C ");
        teamMember2.assignTask("Solve D ");
        teamMember2.assignTask("Solve E ");

        teamMember1.printActivityLog();
        teamMember2.printActivityLog();
        teamMember3 .printActivityLog();

    }
}
