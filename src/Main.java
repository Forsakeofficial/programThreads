public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            System.out.println("Start wątku");
            for (int i = 0; i < 10; i++){
                System.out.println("Krok: " + i);
            }
            System.out.println("Koniec wątku");

            System.out.println("Start wątku");
            for (int i = 10; i < 20; i++){
                System.out.println("Krok: " + i);
            }
            System.out.println("Koniec wątku");

            System.out.println("Start wątku");
            for (int i = 20; i < 30; i++){
                System.out.println("Krok: " + i);
            }
            System.out.println("Koniec wątku");
        });
        thread1.start();


    }
}