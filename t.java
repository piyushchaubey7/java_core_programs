/*class B extends Thread { // Class name starts with an uppercase letter
    int i;

    @Override
    public void run() { // Correctly overriding the run() method
        for (i = 1; i <= 5; i++) {
            System.out.println("Thread T: " + i);
        }
    }
}

public class T{ // Main class
    public static void main(String[] args) {
        int j;
        B obj = new B(); // Create an object of the thread class
        obj.start(); // Start the thread

        for (j = 1; j <= 5; j++) {
            System.out.println("Main Thread: " + j);
        }
    }
}
*/