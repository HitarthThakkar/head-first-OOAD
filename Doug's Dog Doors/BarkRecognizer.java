
public class BarkRecognizer {

    private final DogDoor door;

    public BarkRecognizer(DogDoor door) {
        this.door = door;
    }

    public void recognize(Bark bark) {
        System.out.println("  BarkRecognizer: Heard a '" + bark.getSound() + "'");

        for (Object allowedBarkObject : door.getAllowedBarks()) {
            if (allowedBarkObject.equals(bark)) {
                door.open();
                break;
            }
        }

        if (!door.isOpen()) {
            System.out.println("This dog is not allowed.");
        }
    }
}
