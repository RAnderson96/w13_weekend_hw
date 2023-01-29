package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import instrument_types.InstrumentType;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType instrumentType;
    private String colour;
    private String material;

    public Instrument(InstrumentType instrumentType, String colour, String material) {
        this.instrumentType = instrumentType;
        this.colour = colour;
        this.material = material;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getColour() {
        return colour;
    }


    public String getMaterial() {
        return material;
    }




}
