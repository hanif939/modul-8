
package Queue;

public class AntrianApp {
    public static void main(String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai paling depan = " + antrian.peek());
        antrian.display();
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
       System.out.println("nilai paling depan = " + antrian.peek());
        antrian.display();
    }
}

