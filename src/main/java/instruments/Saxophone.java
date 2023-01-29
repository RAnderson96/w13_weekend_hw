package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import instrument_types.InstrumentType;

public class Saxophone extends Instrument {
    private int numValves;

    public Saxophone(InstrumentType instrumentType, String colour, String material, int numValves) {
        super(instrumentType, colour, material);
        this.numValves = numValves;
    }

    public int getNumValves() {
        return numValves;
    }



    @Override
    public String playSound() {
        return "saxophone noises";
    }

    @Override
    public double calculateMarkup() {
        return 1.5;
    }
}
