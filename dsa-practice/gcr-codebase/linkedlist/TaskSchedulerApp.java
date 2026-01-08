class TaskScheduler {
    TaskNode head = null;
    TaskNode current = null;

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = current = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;

            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add at specific position
    void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;

        TaskNode newNode = new TaskNode(id, name, priority, date);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    void removeTask(int id) {
        if (head == null)
            return;

        TaskNode curr = head, prev = null;

        do {
            if (curr.taskId == id) {
                if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;

                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Task removed: " + id);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found!");
    }

    // View current task and move next
    void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }
        displayTask(current);
        current = current.next;
    }

    // Display all tasks
    void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }

        TaskNode temp = head;
        System.out.println("\nTask List:");
        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null)
            return;

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No task found with priority " + priority);
    }

    void displayTask(TaskNode t) {
        System.out.println("ID: " + t.taskId +
                " | Name: " + t.taskName +
                " | Priority: " + t.priority +
                " | Due: " + t.dueDate);
    }
}
public class TaskSchedulerApp {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Design Module", 1, "10-Jan");
        scheduler.addAtEnd(2, "Coding", 2, "15-Jan");
        scheduler.addAtBeginning(3, "Requirement Analysis", 1, "5-Jan");

        scheduler.displayAllTasks();

        scheduler.viewNextTask();
        scheduler.viewNextTask();

        scheduler.searchByPriority(1);
        scheduler.removeTask(2);

        scheduler.displayAllTasks();
    }
}
