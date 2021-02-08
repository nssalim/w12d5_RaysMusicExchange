package music_shop;

public class Piano extends Instrument {

    protected String make;
    protected String model;
    protected String colour;
    protected int numberOfKeys;

    public Piano(String make, String model, String colour, int numberOfKeys, int costPrice, int retailPrice) {
        super(make, model, colour, InstrumentType.KEYBOARD, costPrice, retailPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.numberOfKeys = numberOfKeys;
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

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }

    public String play() {
        return "Every Day by Buddy Holly";
    }

    public int getMarkup() {
        return this.retailPrice - this.costPrice;
    }

}
