
import java.util.List;


public class FindGuitarTester {

    public static void main(String[] args) {
        // Set up Rick’s guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = guitar.getSpec();
                System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 12, Wood.ALDER, Wood.ALDER);
        inventory.addGuitar("V95694", 1599.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
    }
}
