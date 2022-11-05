public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("Start wątku 1");
            for (int i = 0; i < 10; i++){
                System.out.println("[Thread 1] Krok: " + i);
            }
            System.out.println("Koniec wątku 1");
        });
        Thread thread2 = new Thread(()->{
            System.out.println("Start wątku 2");
            for (int i = 0; i < 10; i++){
                System.out.println("[Thread 2] Krok: " + i);
            }
            System.out.println("Koniec wątku 2");
        });
        Thread thread3 = new Thread(()->{
            System.out.println("Start wątku 3");
            for (int i = 0; i < 10; i++){
                System.out.println("[Thread 3] Krok: " + i);
            }
            System.out.println("Koniec wątku 3");
        });
        thread1.start();
        thread2.start();
        thread3.start();


    }
}