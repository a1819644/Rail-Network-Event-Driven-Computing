import java.util.ArrayList;
import java.util.Collections;

/** calculating the position of the trains using matrix cal m */
public class MarkingMatrix {



    static ArrayList<ArrayList<Integer>> TotalTransitions = new ArrayList<ArrayList<Integer>>();
    static int count = 0;

    static ArrayList<Integer> line = new ArrayList<Integer>();
    static ArrayList<Integer> previousResult =
            new ArrayList<Integer>(); // holding the result from the previous calculation
    static ArrayList<Integer> numberOfPredefinedTokens = new ArrayList<Integer>();

    private static int numberOfTimesMovesP1 = 0;
    private static int numberOfTimesMovesP3 = 0;
    private static int numberOfTimesMovesP4 = 0;
    private static int numberOfTimesMovesP11 = 0;
    private static int numberOfTimesMovesP9 = 0;
    private static int numberOfTimesMovesP2 = 0;
    private static int isinUsee1 = 0;
    private static int isinUsee2 = 0;
    private static int isinUsee3 = 0;
    private static int isinUsee4 = 0;

    /**
     * return marking matrix of the entries 1 & 3 for left to right 4,9,10 & 11 for right to left
     *
     * @param
     */
    public static ArrayList markingMatrix(ArrayList<Integer> marking2) { // using only one time
        ArrayList<Integer> marking1 = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++) { // 15 number of nodes

            if (i == 11 && isinUsee1 == 0 && marking2.contains(12)) { // initializing the e1
                marking1.add(1);
                isinUsee1++;
                continue;

            } else if (i == 12 && isinUsee2 == 0 && marking2.contains(13)) { // initializing e2
                marking1.add(1);
                isinUsee2++;
                continue;

            } else if (i == 13 && isinUsee3 == 0 && marking2.contains(14)) {
                marking1.add(1);
                isinUsee3++;
                continue;
            } else if (i == 14 && isinUsee4 == 0 && marking2.contains(15)) {
                marking1.add(1);
                isinUsee4++;
                continue;
            }
            if (count > 1) {
                marking1  = previousResult;
                break;
            }
            marking1.add(0);
        }



        count++;
        return marking1;
    }

    public static void transitions() {
        ArrayList<Integer> t1 = new ArrayList<Integer>();
        ArrayList<Integer> t2 = new ArrayList<Integer>();
        ArrayList<Integer> t3 = new ArrayList<Integer>();
        ArrayList<Integer> t4 = new ArrayList<Integer>();
        ArrayList<Integer> t5 = new ArrayList<Integer>();
        ArrayList<Integer> t6 = new ArrayList<Integer>();
        ArrayList<Integer> t7 = new ArrayList<Integer>();
        ArrayList<Integer> t8 = new ArrayList<Integer>();
        ArrayList<Integer> t9 = new ArrayList<Integer>();
        ArrayList<Integer> t10 = new ArrayList<Integer>();
        ArrayList<Integer> t11 = new ArrayList<Integer>();
        ArrayList<Integer> t12 = new ArrayList<Integer>();
        ArrayList<Integer> t13 = new ArrayList<Integer>();
        ArrayList<Integer> t14 = new ArrayList<Integer>();
        ArrayList<Integer> t15 = new ArrayList<Integer>();
        ArrayList<Integer> t16 = new ArrayList<Integer>();
        ArrayList<Integer> t17 = new ArrayList<Integer>();
        ArrayList<Integer> t18 = new ArrayList<Integer>();
        ArrayList<Integer> t19 = new ArrayList<Integer>();
        ArrayList<Integer> t20 = new ArrayList<Integer>();
        ArrayList<Integer> t21 = new ArrayList<Integer>();
        ArrayList<Integer> t22 = new ArrayList<Integer>();
        ArrayList<Integer> t23 = new ArrayList<Integer>();
        ArrayList<Integer> t24 = new ArrayList<Integer>();

        for (int i = 0; i < 21; i++) {
            if (i == 0) {
                t1.add(1);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 2) { // t2
                t1.add(0);
                t2.add(1);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 3) { // t9
                t1.add(0);
                t2.add(0);
                t3.add(1);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 4) { // t4
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(1);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 5) {
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(1);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 6) { // t6
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(1);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 7) { // t7
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(1);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 8) { // t8
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(1);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 9) { // t8
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(1);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 9) { // t8
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(1);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 10) { // t10
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(10);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 11) { // t11
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(1);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 12) { // t12
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(1);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 13) { // t13
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(1);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 14) { // t14
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(1);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 15) { // t15
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(1);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 16) { // t16
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(1);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 17) { // t17
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(1);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 18) { // t18
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(1);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 19) { // t19
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(1);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 20) { // t20
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(1);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }
            if (i == 21) { // t20
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(1);
                t22.add(0);
                t23.add(0);
                t24.add(0);
            }

            if (i == 22) { // t21
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(1);
                t23.add(0);
                t24.add(0);
            }

            if (i == 23) { // t23
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(1);
                t24.add(0);
            }

            if (i == 24) { // t24
                t1.add(0);
                t2.add(0);
                t3.add(0);
                t4.add(0);
                t5.add(0);
                t6.add(0);
                t7.add(0);
                t8.add(0);
                t9.add(0);
                t10.add(0);
                t11.add(0);
                t12.add(0);
                t13.add(0);
                t14.add(0);
                t15.add(0);
                t16.add(0);
                t17.add(0);
                t18.add(0);
                t19.add(0);
                t20.add(0);
                t21.add(0);
                t22.add(0);
                t23.add(0);
                t24.add(1);
            }
        }
        TotalTransitions.add(t1);
        TotalTransitions.add(t2);
        TotalTransitions.add(t3);
        TotalTransitions.add(t4);
        TotalTransitions.add(t5);
        TotalTransitions.add(t6);
        TotalTransitions.add(t7);
        TotalTransitions.add(t8);
        TotalTransitions.add(t9);
        TotalTransitions.add(t10);
        TotalTransitions.add(t11);
        TotalTransitions.add(t12);
        TotalTransitions.add(t13);
        TotalTransitions.add(t14);
        TotalTransitions.add(t15);
        TotalTransitions.add(t16);
        TotalTransitions.add(t17);
        TotalTransitions.add(t18);
        TotalTransitions.add(t19);
        TotalTransitions.add(t20);
        TotalTransitions.add(t21);
        TotalTransitions.add(t22);
        TotalTransitions.add(t23);
        TotalTransitions.add(t24);
    }

    // for track 1 from left to right
    public static boolean testLineP1(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        String last = "not";

        // p1 = t13 -> t14-> t15-> t16-> t17
        if (numberOfTimesMovesP1 == 0) { // p1
            markingMatrix.add(13);
            marking = markingMatrix(markingMatrix); // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            0,
                            IncidenceMatrix.incidenceMatrix.get(
                                    12)); //
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(12));
            numberOfPredefinedTokens.add(11);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue =
                        isTrainPassed(
                                dotProduct2,
                                1,
                                12,
                                last); // just passing the reference of the arrayList of the dot product result and
                isEInUsed(IncidenceMatrix.incidenceMatrix.get(12));
                copy(dotProduct2);
            } else {
                isTrue = false;
            }

        } else if (numberOfTimesMovesP1 == 1) { // p5
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 1, IncidenceMatrix.incidenceMatrix.get(13)); // for t14
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(13));
            isTrue = isTrainPassed(dotProduct2, 5, 13, last);
            copy(dotProduct2);

        } else if (numberOfTimesMovesP1 == 2 && destination == 8) { // p8
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 2, IncidenceMatrix.incidenceMatrix.get(14)); // for t15


            isEInUsed(IncidenceMatrix.incidenceMatrix.get(14));


            isTrue = isTrainPassed(dotProduct2, 8, 14, last);
            copy(dotProduct2);


        } else if (numberOfTimesMovesP1 == 2 && destination == 9) { // p9
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking, 3, IncidenceMatrix.incidenceMatrix.get(14)); // activating t15
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(14));

            isTrue = isTrainPassed(dotProduct2, 9, 14, last);
            copy(dotProduct2);


        } else if (numberOfTimesMovesP1 == 3 && destination == 8) { // p8
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 2, IncidenceMatrix.incidenceMatrix.get(16)); // for t17
            numberOfPredefinedTokens.add(0); // we are using all four tokens//-1
            releaseE(IncidenceMatrix.incidenceMatrix.get(16));
            numberOfPredefinedTokens.add(11);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1444, 16, "last");
                copy(dotProduct2);

            } else {
                isTrue = false;
            }

        } else if (numberOfTimesMovesP1 == 3 && destination == 9) { // p9
            marking = previousResult; // calling marking Matrix function//-1
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking, 3, IncidenceMatrix.incidenceMatrix.get(15)); // activating t16


            numberOfPredefinedTokens.add(11);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1444, 15, "last");
                copy(dotProduct2);
                releaseE(IncidenceMatrix.incidenceMatrix.get(15));

            } else {
                isTrue = false;
            }
        }
        numberOfPredefinedTokens.removeAll(numberOfPredefinedTokens);
        numberOfTimesMovesP1++;
        return isTrue;
    } // done

    // for track 3 from left to right
    public static boolean testLineP3(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        if (destination == 4) { // checking the destination of the train
            if (numberOfTimesMovesP3 == 0) {
                markingMatrix.add(14);
                marking = markingMatrix(markingMatrix);

                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                2, //
                                IncidenceMatrix.incidenceMatrix.get(2)); // t3
                isEInUsed(IncidenceMatrix.incidenceMatrix.get(2));
                numberOfPredefinedTokens.add(13); // we are using all four tokens
                if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                    isTrue = isTrainPassed(dotProduct2, 3, 3, "not"); // same
                    copy(dotProduct2);
                } else {
                    isTrue = false;
                }
            } else if (numberOfTimesMovesP3 == 1) {
                marking = previousResult; // calling marking Matrix function
                numberOfPredefinedTokens.add(11);
                numberOfPredefinedTokens.add(12);
                numberOfPredefinedTokens.add(14);
                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                3,
                                IncidenceMatrix.incidenceMatrix.get(
                                        17)); // calling the sum of the matrix function t18

                isTrue = isTrainPassed(dotProduct2, 4, 18, "no"); // same
                copy(dotProduct2);

            } else if (numberOfTimesMovesP3 == 2) {
                marking = previousResult; // calling marking Matrix function

                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                3,
                                IncidenceMatrix.incidenceMatrix.get(
                                        18)); // calling the sum of the matrix function t19
                numberOfPredefinedTokens.add(11);
                numberOfPredefinedTokens.add(12);
                numberOfPredefinedTokens.add(12);
                numberOfPredefinedTokens.add(14);
                if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                    isTrue =
                            isTrainPassed(dotProduct2, 1444, /*at the end destination means nothing*/ 19, "last");
                    releaseE(IncidenceMatrix.incidenceMatrix.get(18));
                    copy(dotProduct2);

                } else {
                    isTrue = false;
                }
            }
            numberOfPredefinedTokens.removeAll(numberOfPredefinedTokens);
        }

        if (destination == 11) {
            if (numberOfTimesMovesP3 == 0) { // starting by putting the train into the track(p3)
                markingMatrix.add(14);
                marking = markingMatrix(markingMatrix); // calling marking Matrix function
                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                2,
                                IncidenceMatrix.incidenceMatrix.get(
                                        2)); // calling the sum of the matrix function t3 (-1 both)
                isEInUsed(IncidenceMatrix.incidenceMatrix.get(2));
                numberOfPredefinedTokens.add(13); // we are using all four tokens
                if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                    isTrue = isTrainPassed(dotProduct2, 3, 3, "not"); // same
                    copy(dotProduct2);
                } else {
                    isTrue = false;
                }
            } else if (numberOfTimesMovesP3 == 1) {
                marking = previousResult; // calling marking Matrix function
                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                0,
                                IncidenceMatrix.incidenceMatrix.get(
                                        0)); // calling the sum of the matrix function t3 (-1 both)


                isTrue = isTrainPassed(dotProduct2, 7, 1, "not"); // same
                copy(dotProduct2);

            } else if (numberOfTimesMovesP3 == 2) {
                marking = previousResult; // calling marking Matrix function
                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                1,
                                IncidenceMatrix.incidenceMatrix.get(
                                        1)); // calling the sum of the matrix function t3 (-1 both)



                isTrue = isTrainPassed(dotProduct2, 11, 2, "not"); // same
                copy(dotProduct2);
            } else if (numberOfTimesMovesP3 == 3) {
                marking = previousResult; // calling marking Matrix function
                dotProduct2 =
                        sumOfTheMatrixFirst(
                                marking,
                                3,
                                IncidenceMatrix.incidenceMatrix.get(
                                        3)); // calling the sum of the matrix function t3 (-1 both)
                numberOfPredefinedTokens.add(13);
                if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                    isTrue = isTrainPassed(dotProduct2, 1888, 3, "last"); // same
                    copy(dotProduct2);
                    releaseE(IncidenceMatrix.incidenceMatrix.get(
                            3));
                } else {
                    isTrue = false;
                }
            }
            numberOfPredefinedTokens.removeAll(numberOfPredefinedTokens);
        }

        numberOfTimesMovesP3++;
        return isTrue;
    } // done

    public static boolean testLineP11(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        if (numberOfTimesMovesP11
                == 0) { // starting by putting the train into the track(p3) from right to left
            markingMatrix.add(14);
            marking = markingMatrix(markingMatrix); // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            10,
                            IncidenceMatrix.incidenceMatrix.get(
                                    4)); // calling the sum of the matrix function t3 (-1 both) //5
            numberOfPredefinedTokens.add(13); // we are using all four tokens
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(4));
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 11, 5, "not"); // t5 to p5
                copy(dotProduct2);
            } else {
                isTrue = false;
            }
        } else if (numberOfTimesMovesP11 == 1) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            5,
                            IncidenceMatrix.incidenceMatrix.get(5)); // calling the sum of the matrix function t6

            isTrue = isTrainPassed(dotProduct2, 7, 6, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP11 == 2) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            2,
                            IncidenceMatrix.incidenceMatrix.get(6)); // calling the sum of the matrix function t7
            isTrue = isTrainPassed(dotProduct2, 3, 7, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP11 == 3) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            7,
                            IncidenceMatrix.incidenceMatrix.get(
                                    7)); // calling the sum of the matrix function t8 (-1 both)
            numberOfPredefinedTokens.add(13);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1888, 8, "last"); // t8 last id
                copy(dotProduct2);
                releaseE(IncidenceMatrix.incidenceMatrix.get(
                        7));

            } else {
                isTrue = false;
            }
            numberOfPredefinedTokens.removeAll(numberOfPredefinedTokens);
        }
        numberOfTimesMovesP11++;
        return isTrue;
    }

    public static boolean testLineP10(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        if (numberOfTimesMovesP2
                == 0) { // starting by putting the train into the track(p3) from right to left
            markingMatrix.add(13);
            marking = markingMatrix(markingMatrix); // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 11, IncidenceMatrix.incidenceMatrix.get(11)); // t12
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(11));
            numberOfPredefinedTokens.add(12); // location of e
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 10, 12, "no"); // t12 same
                copy(dotProduct2);
            } else {
                isTrue = false;
            }

        } else if (numberOfTimesMovesP2 == 1) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            2,
                            IncidenceMatrix.incidenceMatrix.get(
                                    10)); // calling the sum of the matrix function t11
            isTrue = isTrainPassed(dotProduct2, 6, 11, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP2 == 2) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            9,
                            IncidenceMatrix.incidenceMatrix.get(9)); // calling the sum of the matrix function t10

            isTrue = isTrainPassed(dotProduct2, 2, 10, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP2 == 3) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 = sumOfTheMatrixFirst(marking, 8, IncidenceMatrix.incidenceMatrix.get(8)); // t9
            numberOfPredefinedTokens.add(12);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1888, 9, "last"); // t8 last id
                copy(dotProduct2);//
                releaseE(IncidenceMatrix.incidenceMatrix.get(8)); // setting everything back
            } else {
                isTrue = false;
            }
        }
        numberOfPredefinedTokens.removeAll(numberOfPredefinedTokens);

        numberOfTimesMovesP2++;
        return isTrue;
    }

    public static boolean testLineP9(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        if (numberOfTimesMovesP9
                == 0) { // starting by putting the train into the track(p3) from right to left
            markingMatrix.add(12);
            markingMatrix.add(13);
            marking = markingMatrix(markingMatrix); // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 22, IncidenceMatrix.incidenceMatrix.get(22)); // t23
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(22));
            numberOfPredefinedTokens.add(11);
            numberOfPredefinedTokens.add(12); // location of e
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 9, 23, "not"); // t24
                copy(dotProduct2);
            } else {
                isTrue = false;
            }
        } else if (numberOfTimesMovesP9 == 1) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(marking, 23, IncidenceMatrix.incidenceMatrix.get(23)); // t24

            isTrue = isTrainPassed(dotProduct2, 5, 24, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP9 == 2) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            9,
                            IncidenceMatrix.incidenceMatrix.get(9)); // calling the sum of the matrix function t19
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(9));
            isTrue = isTrainPassed(dotProduct2, 2, 10, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP9 == 3) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            8,
                            IncidenceMatrix.incidenceMatrix.get(
                                    8)); //

            numberOfPredefinedTokens.add(11);
            numberOfPredefinedTokens.add(12); // location of e
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1888, 9, "last"); // t9 last id
                releaseE(IncidenceMatrix.incidenceMatrix.get(9));
                copy(dotProduct2);
            } else {
                isTrue = false;
            }

        }
        numberOfTimesMovesP9++;
        return isTrue;
    }

    public static boolean testLineP4(String trainName, int startingTrack, int destination) {
        boolean isTrue = false;
        ArrayList<Integer> dotProduct2 =
                new ArrayList<
                        Integer>(); // saving the sum of the results of the dot product + marking matrices
        ArrayList<Integer> marking = new ArrayList<Integer>();
        ArrayList<Integer> markingMatrix = new ArrayList<Integer>();
        if (numberOfTimesMovesP4
                == 0) { // starting by putting the train into the track(p3) from right to left
            markingMatrix.add(12);
            markingMatrix.add(13);
            markingMatrix.add(14);
            markingMatrix.add(15);
            marking = markingMatrix(markingMatrix); // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            19,
                            IncidenceMatrix.incidenceMatrix.get(
                                    19)); // calling the sum of the matrix function t3 (-1 both)
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(19));
            numberOfPredefinedTokens.add(11);
            numberOfPredefinedTokens.add(12);
            numberOfPredefinedTokens.add(13);
            numberOfPredefinedTokens.add(14);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 4, 20, "not"); // t20 to p4
                copy(dotProduct2);
            } else {
                isTrue = false;
            }

        } else if (numberOfTimesMovesP4 == 1) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            21,
                            IncidenceMatrix.incidenceMatrix.get(
                                    21)); // calling the sum of the matrix function t18
            isEInUsed(IncidenceMatrix.incidenceMatrix.get(21));
            isTrue = isTrainPassed(dotProduct2, 3, 22, "no");
            copy(dotProduct2);
        } else if (numberOfTimesMovesP4 == 3) {
            marking = previousResult; // calling marking Matrix function
            dotProduct2 =
                    sumOfTheMatrixFirst(
                            marking,
                            20,
                            IncidenceMatrix.incidenceMatrix.get(
                                    20)); // calling the sum of the matrix function t3 (-1 both)


            numberOfPredefinedTokens.add(11);
            numberOfPredefinedTokens.add(12);
            numberOfPredefinedTokens.add(13);
            numberOfPredefinedTokens.add(14);
            if (isAvailable(dotProduct2, previousResult, numberOfPredefinedTokens)) {
                isTrue = isTrainPassed(dotProduct2, 1888, 21, "last"); // t9 last id
                releaseE(IncidenceMatrix.incidenceMatrix.get(
                        20));
                copy(dotProduct2);
            } else {
                isTrue = false;
            }

        }
        numberOfTimesMovesP4++;
        return isTrue;
    }


    private static void copy( ArrayList<Integer> from) {
        previousResult = from;
        for (int i = 0; i < from.size(); i++) {
            previousResult.set(i, from.get(i));
        }
    }


    private static void releaseE(ArrayList<Integer> result) {
        if (result.get(11) == 1) {
            isinUsee1 = 0;
        }
        if (result.get(12) == 1) {
            isinUsee2 = 0;
        }
        if (result.get(13) == 1) {
            isinUsee3 = 0;
        }
        if (result.get(14) == 1) {
            isinUsee4 = 0;
        }
    }

    private static void isEInUsed(ArrayList<Integer> result) {

        if (result.get(11) == -1) {
            isinUsee1++;
        }
        if (result.get(12) == -1) {
            isinUsee2++;
        }
        if (result.get(13) == -1) {
            isinUsee3++;
        }
        if (result.get(14) == -1) {
            isinUsee4++;
        }
    }


    /**
     * @param markingMatrix passing the marking matrix of the node id
     * @param startingTrack track id
     * @param resultOfDotProductOfMatrix
     * @return
     */
    // at the end summing everything part _ 1
    public static ArrayList<Integer> sumOfTheMatrixFirst(
            ArrayList<Integer> markingMatrix,
            int startingTrack,
            ArrayList<Integer> resultOfDotProductOfMatrix) {
        ArrayList<Integer> resultingTrack = new ArrayList<Integer>();
        for (int j = 0; j < 15; j++) {
            int output = resultOfDotProductOfMatrix.get(j);
            int resultOfMarkingMatrix = markingMatrix.get(j); // getting the value from marking Matrix
            resultingTrack.add(output + resultOfMarkingMatrix);
        }
        // countingOneTime ++;
        return resultingTrack;
    }

    /**
     * @param outputOfSum
     * @return true if the train has been moved otherwise false
     */
    // has the train been passed? true or false
    static boolean isTrainPassed(
            ArrayList<Integer> outputOfSum, int des, int transitionsId, String isLast) {

        return isLast == "last"
                || outputOfSum.get(des - 1) == 1; // showing that it has moved from another node
        // }
    }

    private static boolean isAvailable(
            ArrayList<Integer> current,
            ArrayList<Integer> previous,
            ArrayList<Integer>
                    requiredEsTokens) { // required to check whether the transition is active or not
        boolean isAvailable = true;
        if (previous.isEmpty()) {
            return true;
        }
        for (int i = 0; i < requiredEsTokens.size(); i++){
            int temp = requiredEsTokens.get(i);
            int temp2 = current.get(temp);
            isAvailable = temp2 == 1;
        }

        return isAvailable;
    }
}
