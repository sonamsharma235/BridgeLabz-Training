class TaskRunner extends Thread {

    public void run() {

        try {
            Thread.sleep(2000);   // TIMED_WAITING
        } 
        catch(Exception e){}

        // computation
        for(int i=0;i<10000;i++);
    }
}

class StateMonitor extends Thread {

    Thread t;

    public StateMonitor(Thread t) {
        this.t = t;
    }

    public void run() {

        while(true) {

            System.out.println(
                "[Monitor] " + t.getName() +
                " is in " + t.getState()
            );

            if(t.getState() == Thread.State.TERMINATED)
                break;

            try {
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }
}

public class StateDemo {

    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner();

        StateMonitor m = new StateMonitor(t1);

        m.start();
        t1.start();
    }
}
