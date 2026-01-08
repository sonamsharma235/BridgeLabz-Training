class ProcessNode {
    int pid, burstTime, remainingTime, priority;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = this;
    }
}

class RoundRobinScheduler {
    ProcessNode head = null;

    // Add process at end
    void addProcess(int pid, int bt, int priority) {
        ProcessNode newNode = new ProcessNode(pid, bt, priority);
        if (head == null) {
            head = newNode;
        } else {
            ProcessNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Simulate scheduling
    void schedule(int quantum) {
        int time = 0;
        int totalWT = 0, totalTAT = 0;
        int count = countProcesses();

        ProcessNode curr = head, prev = null;

        while (head != null) {
            if (curr.remainingTime > 0) {
                int exec = Math.min(quantum, curr.remainingTime);
                time += exec;
                curr.remainingTime -= exec;

                if (curr.remainingTime == 0) {
                    totalTAT += time;
                    totalWT += time - curr.burstTime;

                    removeProcess(curr.pid);
                    curr = (prev != null) ? prev.next : head;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            displayProcesses();
        }

        System.out.println("\nAverage Waiting Time: " + (double) totalWT / count);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / count);
    }

    // Remove process
    void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head, prev = null;
        do {
            if (curr.pid == pid) {
                if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    void displayProcesses() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }
        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class RoundRobinMain {
    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        int timeQuantum = 3;
        scheduler.schedule(timeQuantum);
    }
}
