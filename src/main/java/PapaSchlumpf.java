import java.util.concurrent.Semaphore;

public class PapaSchlumpf {

    private Semaphore semaphore;

    public PapaSchlumpf(int limit){
        this.semaphore = new Semaphore(limit);
    }

    boolean tryToDeliverJuice(){
        return true;
    }
}
