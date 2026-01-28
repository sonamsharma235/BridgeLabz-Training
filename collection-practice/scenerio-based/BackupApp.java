public class BackupApp {
    public static void main(String[] args) {
        BackupScheduler scheduler = new BackupScheduler();

        try {
            scheduler.addTask(new BackupTask("/system/config", 5));
            scheduler.addTask(new BackupTask("/user/docs", 2));
            scheduler.addTask(new BackupTask("", 3)); // exception
        } catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }

        scheduler.executeBackups();
    }
}
