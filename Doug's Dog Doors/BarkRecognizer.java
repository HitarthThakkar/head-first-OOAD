
public class BarkRecognizer {

    private final DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(String bark) {
        System.err.println("  BarkRecognizer: Heard a '" + bark + "'");
        door.open();
    }
}
