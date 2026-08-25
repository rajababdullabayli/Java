package OOP.ClassTasks.Task_3;

import java.util.ArrayList;

public class TeamMember {
    private String memberName;
    private String memberId;
    private ArrayList<String> taskList;
    private int maxCapacity;
    private int accessPin;
    private boolean isOnLeave;
    private int wrongPinCount;
    private ArrayList<String> activityLog;
    private int completedTaskCount;


    public TeamMember(String memberName, String memberId, int accessPin) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.taskList = new ArrayList<>();
        this.maxCapacity = 5;
        this.isOnLeave = false;
        this.wrongPinCount = 0;
        this.activityLog = new ArrayList<>();
        this.completedTaskCount = 0;

        if (accessPin >= 1000 && accessPin <= 9999) {
            this.accessPin = accessPin;
        } else {
            System.out.println("Invalid access pin. Defaulting to 1234");
            this.accessPin = 1234;
        }
    }

    public void assignTask(String taskName) {
        if (isOnLeave) {
            System.out.println(memberName + " is on leave! Cannot assign task.");
        } else {
            if (taskList.size() < maxCapacity) {
                taskList.add(taskName);
                activityLog.add("Task " + taskName);
            } else {
                System.out.println("Too many tasks!");
            }
        }
    }

    public boolean completeTask(String taskName, int enteredPin) {
        if (isOnLeave) {
            System.out.println(memberName + " is on leave! Cannot assign task.");
            return false;
        } else {
            if (accessPin == enteredPin) {
                wrongPinCount = 0;
                if (taskList.contains(taskName)) {
                    taskList.remove(taskName);
                    activityLog.add("Completed Task " + taskName);
                    completedTaskCount++;
                    TaskSuccessCount();
                    return true;
                } else {
                    System.out.println("Task not found!");
                    return false;
                }
            } else {
                System.out.println("Invalid access pin!");
                wrongPinCount++;
                if (wrongPinCount >= 3) {
                    System.out.println("3 times wrong Pin!");
                    setOnLeave();
                }
                return false;
            }
        }
    }

    public void checkWorkload(int enteredPin) {
        if (accessPin == enteredPin) {
            System.out.println(taskList.size() + " tasks have been assigned!");
            for (int i = 0; i < taskList.size(); i++) {
                System.out.println(taskList.get(i));
            }
        } else {
            System.out.println("Invalid access pin");
        }
    }

    public void reassignTask(TeamMember receiver, String taskName, int enteredPin) {
        if (accessPin == enteredPin) {
            receiver.assignTask(taskName);
            taskList.remove(taskName);
            activityLog.add("Reassign Task " + taskName);
        }
    }

    public void setOnLeave() {
        isOnLeave = true;
        activityLog.add("On Leave");
    }

    public void printActivityLog() {
        for (String log : activityLog) {
            System.out.println(log);
        }
    }

    public void earnBadge() {
        maxCapacity += 2;
    }

    public void TaskSuccessCount() {
        completedTaskCount++;
        if (completedTaskCount == 5) {
            earnBadge();
            completedTaskCount = 0;
        }
    }
}
