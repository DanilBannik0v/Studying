package classes;

public class Bell {
    int soundCounter;

    public Bell() {
        this.soundCounter = 0;
    }

    public void sound() {
        this.soundCounter += 1;
        if (soundCounter % 2 == 1) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
    }
}