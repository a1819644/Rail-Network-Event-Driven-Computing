// created by a1819644

import java.util.ArrayList;
import java.util.Iterator;

/** class will have the main implementation of the rail network */
public class InterlockingImpl implements Interlocking {
    public ArrayList<AddTrain> onTrack = new ArrayList<>();
    ArrayList<AddTrain> addedTrain = new ArrayList<>();

    public static void main(String[] args) {
        InterlockingImpl interlocking = new InterlockingImpl();
        IncidenceMatrix.addMatrix();

        MarkingMatrix.transitions();
        /*String[] trainName = {"first train"};
        interlocking.addTrain("first train", 3, 4);
        *//* interlocking.addTrain("second train", 4, 3);*//*

        interlocking.moveTrains(trainName);
        interlocking.getSection(3);
        interlocking.getTrain("first train")*/;
    }

    /**
     * Adds a train to the rail corridor.
     *
     * @param trainName A String that identifies a given train. Cannot be the same as any other train
     *     present.
     * @param entryTrackSection The id number of the track section that the train is entering into.
     * @param destinationTrackSection The id number of the track section that the train should exit
     *     from.
     * @throws IllegalArgumentException if the train name is already in use, or there is no valid path
     *     from the entry to the destination
     * @throws IllegalStateException if the entry track is already occupied
     */
    @Override
    public void addTrain(String trainName, int entryTrackSection, int destinationTrackSection)
            throws IllegalArgumentException, IllegalStateException {
        if (addedTrain.isEmpty()) {
            AddTrain addTrain = new AddTrain(trainName, entryTrackSection, destinationTrackSection);
            addedTrain.add(addTrain);
        } else {
            // iterating all the trainNames and paths
            Iterator<AddTrain> iter = addedTrain.iterator();
            while (iter.hasNext()) {
                // checking train name is already or there is no valid path from the entry to the
                // destination
                // @throws  IllegalArgumentException
                AddTrain adt = iter.next();
                if (trainName.equals(adt.getTrainName())
                        || entryTrackSection == 2
                        || entryTrackSection == 5
                        || entryTrackSection == 6
                        || entryTrackSection == 7) {
                    // if the name of the train is similar to the already added one or there is no valid path
                    // from the entry to the destination
                    throw new IllegalArgumentException();
                } else if (entryTrackSection == adt.getEntryTrackSection()) {
                    // if the entry track is already occupied
                    throw new IllegalStateException();
                }
            }
            AddTrain addTrain = new AddTrain(trainName, entryTrackSection, destinationTrackSection);
            addedTrain.add(addTrain);
        }
    }

    /**
     * The listed trains proceed to the next track section. Trains only move if they are able to do
     * so, otherwise they remain in their current section. When a train reaches its destination track
     * section, it exits the rail corridor next time it moves.
     *
     * @param trainNames The names of the trains to move.
     * @return The number of trains that have moved.
     * @throws IllegalArgumentException if the train name does not exist or is no longer in the rail
     *     corridor
     */
    @Override
    public int moveTrains(String[] trainNames) throws IllegalArgumentException {
        int countTrains = 0;

        // The listed trains proceed to the next track section.
        for (String name : trainNames) {
            Iterator<AddTrain> iterationNames = addedTrain.iterator();
            while (iterationNames.hasNext()) {
                AddTrain adt = iterationNames.next();
                // @throws  IllegalArgumentException if the train name does not exist or is no longer in the
                // rail corridor
                // todo : is no longer exist on corridor
                if (name != adt.getTrainName()) {
                    throw new IllegalArgumentException();
                } else {
                    // calling trainNames to move
                    if (name == adt.getTrainName()) {
                        if (1 == adt.getEntryTrackSection()) { // calling the first section train line from left
                            // when the train reaches to its destination then countTrains++
                            if (MarkingMatrix.testLineP1(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }
                        } else if (3 == adt.getEntryTrackSection()) {
                            if (MarkingMatrix.testLineP3(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }

                        } else if (11 == adt.getEntryTrackSection()) {
                            if (MarkingMatrix.testLineP11(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }

                        } else if (9 == adt.getEntryTrackSection()) {
                            if (MarkingMatrix.testLineP9(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }
                        } else if (4 == adt.getEntryTrackSection()) {
                            if (MarkingMatrix.testLineP4(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }
                        } else if (10 == adt.getEntryTrackSection()) {
                            if (MarkingMatrix.testLineP10(
                                    adt.getTrainName(),
                                    adt.getEntryTrackSection(),
                                    adt.getDestinationTrackSection())) {
                                countTrains++;
                                onTrack.add(adt);
                            }
                        }
                    }
                }
            }
        }
        return countTrains;
    }

    /**
     * Returns the name of the Train currently occupying a given track section
     *
     * @param trackSection The id number of the section of track.
     * @return The name of the train currently in that section, or null if the section is
     *     empty/unoccupied.
     * @throws IllegalArgumentException if the track section does not exist
     */
    @Override
    public String getSection(int trackSection) throws IllegalArgumentException {
        if (trackSection != 1
                || trackSection != 3
                || trackSection != 10
                || trackSection != 9
                || trackSection != 11
                || trackSection != 4) {
            for (int i = 0; i < onTrack.size(); i++) {
                if (onTrack.get(i).getEntryTrackSection() == trackSection) {
                    return onTrack.get(i).getTrainName();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }

        return null;
    }

    /**
     * Returns the track section that a given train is occupying
     *
     * @param trainName The name of the train.
     * @return The id number of section of track the train is occupying, or -1 if the train is no
     *     longer in the rail corridor
     * @throws IllegalArgumentException if the train name does not exist
     */
    @Override
    public int getTrain(String trainName) throws IllegalArgumentException {

        for (int i = 0; i < onTrack.size(); i++) {
            if (onTrack.get(i).getTrainName().equals(trainName)) {
                return onTrack.get(i).getEntryTrackSection();
            }
        }
        if (addedTrain.contains(trainName)) {
        } else {
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
