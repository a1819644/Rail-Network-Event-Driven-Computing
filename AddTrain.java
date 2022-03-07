/** adding train into the particular corridors and defining the entry and exit section */
public class AddTrain {
    String trainName;
    int entryTrackSection;
    int destinationTrackSection;

    AddTrain() {}

    AddTrain(String trainName, int entryTrackSection, int destinationTrackSection) {
        this.trainName = trainName;
        this.entryTrackSection = entryTrackSection;
        this.destinationTrackSection = destinationTrackSection;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getEntryTrackSection() {
        return entryTrackSection;
    }

    public int getDestinationTrackSection() {
        return destinationTrackSection;
    }
}
