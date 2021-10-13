public class Producer extends Thread {

    private int countdownToCompletion = 5;
    private String id;
    private Store schlumpfsaftLager;

    public Producer(Store schlumpfsaftLager, String id ){
        this.schlumpfsaftLager = schlumpfsaftLager;
        this.id = id;
    }


    public void run() {
        while (true) {

            try {
                Thread.sleep(1000);
                if (countdownToCompletion == 0) {
                    System.out.println(schlumpfsaftLager.addUnit());
                    countdownToCompletion = 5;
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
