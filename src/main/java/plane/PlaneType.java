package plane;

public enum PlaneType {
    BOEING747(2, 80),
    BOEING737(4, 160),
    AIRBUSA320(2, 80),
    AIRBUSA330(1, 80);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
