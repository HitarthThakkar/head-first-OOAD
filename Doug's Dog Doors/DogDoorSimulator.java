
public class DogDoorSimulator {

    public static void main(String[] args) {

        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        
        // This tests the scenario 6.1 from the use-case.
        boolean testAlternatePath = true;

        System.out.println("Fido barks to go outside...");
        remote.pressButton();

        System.out.println("\nFido has gone outside...");

        System.out.println("\nFido's all done...");

        if (testAlternatePath) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }

            System.out.println("...but he's stuck outside!");
            System.out.println("\nFido starts barking...");
            System.out.println("\n...so Gina grabs the remote control.");
            remote.pressButton();
        }

        System.out.println("\nFido's back inside...");
    }
}
