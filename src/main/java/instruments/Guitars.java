package instruments;

import instrument_types.InstrumentType;

public class Guitars extends Instrument{

    private int numStrings;


    public Guitars(InstrumentType instrumentType, String colour, String material, int numStrings) {
        super(instrumentType, colour, material);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }


    @Override
    public String playSound() {
        return "guitar noises";
    }

    @Override
    public double calculateMarkup() {
        return 1.35;
    }
}
