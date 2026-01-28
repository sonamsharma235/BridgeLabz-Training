class BackupTask implements Comparable<BackupTask> {
    String folderPath;
    int priority; // higher value = higher priority

    BackupTask(String folderPath, int priority) throws InvalidBackupPathException {
        if (folderPath == null || folderPath.isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup path!");
        }
        this.folderPath = folderPath;
        this.priority = priority;
    }

    @Override
    public int compareTo(BackupTask other) {
        return other.priority - this.priority; // descending order
    }

    void execute() {
        System.out.println("Backing up: " + folderPath +
                " | Priority: " + priority);
    }
}
