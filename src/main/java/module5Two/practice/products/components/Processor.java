package module5Two.practice.products.components;

public class Processor {
    protected byte quantityOfCore;
    protected int tactFrequencyOfCore;

    public Processor(){
        quantityOfCore = 2;
        tactFrequencyOfCore = 8;
    }

    public Processor(byte quantityOfCore, int tactFrequencyOfCore) {
        this.quantityOfCore = quantityOfCore;
        this.tactFrequencyOfCore = tactFrequencyOfCore;
    }

    public byte getQuantityOfCore() {
        return quantityOfCore;
    }

    public void setQuantityOfCore(byte quantityOfCore) {
        this.quantityOfCore = quantityOfCore;
    }

    public int getTactFrequencyOfCore() {
        return tactFrequencyOfCore;
    }

    public void setTactFrequencyOfCore(int tactFrequencyOfCore) {
        this.tactFrequencyOfCore = tactFrequencyOfCore;
    }
}
