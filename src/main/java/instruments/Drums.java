package instruments;

import instrument_types.InstrumentType;

public class Drums extends Instrument {
    private int numDrums;

    public Drums(InstrumentType instrumentType, String colour, String material, int numDrums) {
        super(instrumentType, colour, material);
        this.numDrums = numDrums;
    }

    public int getNumDrums() {
        return numDrums;
    }


    @Override
    public String playSound() {
        return "badoom doom dom tschhh";
    }

    @Override
    public double calculateMarkup() {
        return 1.35;
    }
}
