public class Lasagna {

    // 1. Expected oven time (always 40)
    public int expectedMinutesInOven() {
        return 40;
    }

    // 2. Remaining oven time
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // 3. Preparation time (2 minutes per layer)
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // 4. Total working time (prep time + oven time so far)
    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}
