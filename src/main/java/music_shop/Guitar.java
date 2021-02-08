package music_shop;

public class Guitar extends Instrument  {
    protected String make;
    protected String model;
    protected String colour;
    protected int numberOfStrings;

    public Guitar(String make, String model, String colour, int numberOfStrings, int costPrice, int retailPrice) {
        super(make, model, colour, InstrumentType.STRING, costPrice, retailPrice);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.numberOfStrings = numberOfStrings;
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

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play() {
        return "Buddy Holly's unconventional strumming technique...";
    }

    public int getMarkup() {
        return this.retailPrice - this.costPrice;
    }

}
