package music_shop;

import behaviours.IPlay;

public abstract class Instrument extends StockItem implements IPlay {
    protected String make;
    protected String model;
    protected String colour;
    protected InstrumentType type;

    public Instrument(String make, String model, String colour, InstrumentType type, int costPrice, int retailPrice) {
        super(make, model, colour, type, costPrice, retailPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.type = type;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public InstrumentType getType() {
        return this.type;
    }
}