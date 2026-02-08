import java.util.Random;

class FileDownloader extends Thread {

    private String fileName;
    Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(random.nextInt(300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(
                "[" + Thread.currentThread().getName() + 
                "] Downloading " + fileName + ": " + i + "%"
            );
        }
    }
}

public class DownloadThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        FileDownloader t1 = new FileDownloader("Document.pdf");
        FileDownloader t2 = new FileDownloader("Image.jpg");
        FileDownloader t3 = new FileDownloader("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
