import java.util.PriorityQueue;

class BackupScheduler {
    PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    void addTask(BackupTask task) {
        queue.offer(task);
    }

    void executeBackups() {
        while (!queue.isEmpty()) {
            queue.poll().execute();
        }
    }
}
