
import java.util.List;
import models.Builder;
import models.Style;
import models.Type;
import models.Wood;

public class FindInstrumentTester {

    public static void main(String[] args) {
        // Set up Rick’s instrument inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatGuiLikes = new GuitarSpec(Builder.FENDER, "model", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        GuitarSpec whatGui2Likes = new GuitarSpec(Builder.MARTIN, "model", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
        MandolinSpec whatMandoLikes = new MandolinSpec(Builder.FENDER, "model", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER);
        MandolinSpec whatMando2Likes = new MandolinSpec(Builder.MARTIN, "model", Type.ELECTRIC, Style.F, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatGuiLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Gui, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = (GuitarSpec) guitar.getSpec();
                System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Gui, we have nothing for you.");
        }

        matchingGuitars = inventory.search(whatGui2Likes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Gui2, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = (GuitarSpec) guitar.getSpec();
                System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Gui2, we have nothing for you.");
        }

        List<Mandolin> matchingMandolins = inventory.search(whatMandoLikes);
        if (!matchingMandolins.isEmpty()) {
            System.out.println("Mando, you might like these Mandolins:");
            for (Mandolin mandolin : matchingMandolins) {
                MandolinSpec spec = (MandolinSpec) mandolin.getSpec();
                System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood() + " top.\nYou can have it for only $" + mandolin.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Mando, we have nothing for you.");
        }

        matchingMandolins = inventory.search(whatMando2Likes);
        if (!matchingMandolins.isEmpty()) {
            System.out.println("Mando2, you might like these Mandolins:");
            for (Mandolin mandolin : matchingMandolins) {
                MandolinSpec spec = (MandolinSpec) mandolin.getSpec();
                System.out.println(" We have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType() + " guitar:\n  " + spec.getBackWood() + " back and sides,\n  " + spec.getTopWood() + " top.\nYou can have it for only $" + mandolin.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Mando2, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        GuitarSpec g1 = new GuitarSpec(Builder.FENDER, "model", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        GuitarSpec g2 = new GuitarSpec(Builder.FENDER, "model", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);
        GuitarSpec g3 = new GuitarSpec(Builder.MARTIN, "model", Type.ACOUSTIC, 12, Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
        GuitarSpec g4 = new GuitarSpec(Builder.MARTIN, "model", Type.ELECTRIC, 12, Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
        GuitarSpec g5 = new GuitarSpec(Builder.MARTIN, "model", Type.ACOUSTIC, 6, Wood.INDIAN_ROSEWOOD, Wood.MAPLE);
        inventory.addInstrument("serialNumber", 1, g1);
        inventory.addInstrument("serialNumber", 2, g2);
        inventory.addInstrument("serialNumber", 3, g3);
        inventory.addInstrument("serialNumber", 4, g4);
        inventory.addInstrument("serialNumber", 5, g5);

        MandolinSpec m1 = new MandolinSpec(Builder.FENDER, "model", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER);
        MandolinSpec m2 = new MandolinSpec(Builder.FENDER, "model", Type.ACOUSTIC, Style.A, Wood.ALDER, Wood.ALDER);
        MandolinSpec m3 = new MandolinSpec(Builder.MARTIN, "model", Type.ELECTRIC, Style.F, Wood.ALDER, Wood.ALDER);
        MandolinSpec m4 = new MandolinSpec(Builder.MARTIN, "model", Type.ELECTRIC, Style.A, Wood.ALDER, Wood.ALDER);
        MandolinSpec m5 = new MandolinSpec(Builder.MARTIN, "model", Type.ELECTRIC, Style.F, Wood.ALDER, Wood.ALDER);
        inventory.addInstrument("serialNumber", 1, m1);
        inventory.addInstrument("serialNumber", 2, m2);
        inventory.addInstrument("serialNumber", 3, m3);
        inventory.addInstrument("serialNumber", 4, m4);
        inventory.addInstrument("serialNumber", 5, m5);
    }
}
