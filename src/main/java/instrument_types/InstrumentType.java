package instrument_types;

public enum InstrumentType {
    BRASS("Brass"),
    PERCUSSION("Percussion"),
    STRING("String"),
    KEYBOARD("Keyboard");

    private final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
