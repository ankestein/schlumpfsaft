public class Consumer extends Thread {

    private String id;
    private int countdownToCompletion = 10;
    private Store schlumpfsaftLager;

    public Consumer(Store schlumpfsaftLager, String id){
        this.schlumpfsaftLager = schlumpfsaftLager;
        this.id = id;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (countdownToCompletion == 0) {
                    System.out.println(schlumpfsaftLager.substractUnit());
                    countdownToCompletion = 10;
                    continue;
                } else {
                    countdownToCompletion -= 1;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
