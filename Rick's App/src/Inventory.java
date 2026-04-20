
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private final List<Instrument> inventory;

    public Inventory() {
        inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        switch (spec) {
            case GuitarSpec guitarSpec -> instrument = new Guitar(serialNumber, price, guitarSpec);
            case MandolinSpec mandolinSpec -> instrument = new Mandolin(serialNumber, price, mandolinSpec);
            default -> {
            }
        }
        inventory.add(instrument);
    }

    public Instrument getInstrument(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument instanceof Guitar && instrument.getSpec().matches(searchSpec)) {
                matchingGuitars.add((Guitar) instrument);
            }
        }
        return matchingGuitars;
    }

    public List<Mandolin> search(MandolinSpec searchSpec) {
        List<Mandolin> matchingMandolins = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument instanceof Mandolin && instrument.getSpec().matches(searchSpec)) {
                matchingMandolins.add((Mandolin) instrument);
            }
        }
        return matchingMandolins;
    }
}
