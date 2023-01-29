package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import instrument_types.InstrumentType;

public class Pianos extends Instrument {

    public Pianos(InstrumentType instrumentType, String colour, String material) {
        super(instrumentType, colour, material);
    }

    @Override
    public String playSound() {
        return "piano noises";
    }

    @Override
    public double calculateMarkup() {
        return 2;
    }
}
