public class Main
{
    public static void main(String[] args) {
        Store SchlumpfsaftLager = new Store();

        for(int i =0; i < 5; i++){
            Producer producer = new Producer(SchlumpfsaftLager, "Schlumpf" + (String.valueOf(i)));
            producer.start();
        }
    for(int i =0; i < 15; i++){
        Consumer consumer = new Consumer(SchlumpfsaftLager,"Safttrinker" + (String.valueOf(i)));
        consumer.start();
        }
    }
}
