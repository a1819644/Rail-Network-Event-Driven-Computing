import java.util.ArrayList;

/** */
public class IncidenceMatrix {
    // looping adding incident matrix of the design petri-net
    public static ArrayList<ArrayList<Integer>> incidenceMatrix = new ArrayList<ArrayList<Integer>>();

  /*              incidence matrix
  rows represents the transitions
  column represents nodes (p1)
                                             e1 e2 e3 e4(predefined nodes)
          [0, 0, -1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
          [0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0, 0]
          [0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0]
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0]
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0]
          [0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0]
          [0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0]
          [0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0]
          [0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0]
          [0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
          [0, 0, 0, 0, 0, 1, 0, 0, 0, -1, 0, 0, 0, 0, 0]
          [0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, -1, 0, 0]
          [1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0]
          [-1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
          [0, 0, 0, 0, -1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0]
          [0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, 0, 0, 0]
          [0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 1, 0, 0, 0]
          [0, 0, -1, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, 0, -1]
          [0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
          [0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1]
          [0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1]
*/



    // adding values inside the rows and columns
    public static void addMatrix() {
        ArrayList<Integer> t1 = new ArrayList<Integer>(); // for transition 1
        for (int i = 0; i < 15; i++) {
            if (i == 2) { // indexing starting from 0 till 16
                t1.add(-1);
                continue;
            }
            if (i == 6) {
                t1.add(1);
                continue;
            }
            t1.add(0);
        }
        incidenceMatrix.add(t1);

        ArrayList<Integer> t2 = new ArrayList<Integer>(); // for transition 2
        for (int i = 0; i < 15; i++) {
            if (i == 6) { // indexing starting from 0 till 21
                t2.add(-1);
                continue;
            }
            if (i == 10) {
                t2.add(1);
                continue;
            }
            t2.add(0);
        }
        incidenceMatrix.add(t2);

        ArrayList<Integer> t3 = new ArrayList<Integer>(); // for transition 3
        for (int i = 0; i < 15; i++) {
            if (i == 13) { // indexing starting from 0 till 21
                t3.add(-1);
                continue;
            }
            if (i == 2) {
                t3.add(1);
                continue;
            }
            t3.add(0);
        }

        incidenceMatrix.add(t3);
        ArrayList<Integer> t4 = new ArrayList<Integer>(); // for transition 4
        for (int i = 0; i < 15; i++) {
            if (i == 10) { // indexing starting from 0 till 21
                t4.add(-1);
                continue;
            }
            if (i == 13) {
                t4.add(1);
                continue;
            }
            t4.add(0);
        }
        incidenceMatrix.add(t4);

        ArrayList<Integer> t5 = new ArrayList<Integer>(); // for transition 5
        for (int i = 0; i < 15; i++) {
            if (i == 13) { // indexing starting from 0 till 21
                t5.add(-1);
                continue;
            }
            if (i == 10) {
                t5.add(1);
                continue;
            }
            t5.add(0);
        }
        incidenceMatrix.add(t5);

        ArrayList<Integer> t6 = new ArrayList<Integer>(); // for transition 6
        for (int i = 0; i < 15; i++) {
            if (i == 10) { // indexing starting from 0 till 21
                t6.add(-1);
                continue;
            }
            if (i == 6) {
                t6.add(1);
                continue;
            }
            t6.add(0);
        }
        incidenceMatrix.add(t6);

        ArrayList<Integer> t7 = new ArrayList<Integer>(); // for transition 7
        for (int i = 0; i < 15; i++) {
            if (i == 6) { // indexing starting from 0 till 21
                t7.add(-1);
                continue;
            }
            if (i == 2) {
                t7.add(1);
                continue;
            }
            t7.add(0);
        }
        incidenceMatrix.add(t7);

        ArrayList<Integer> t8 = new ArrayList<Integer>(); // for transition 8
        for (int i = 0; i < 15; i++) {
            if (i == 2 ) { // indexing starting from 0 till 21
                t8.add(-1);
                continue;
            }
            if (i == 13){
                t8.add(1);
                continue;
            }
            t8.add(0);
        }
        incidenceMatrix.add(t8);

        ArrayList<Integer> t9 = new ArrayList<Integer>(); // for transition 9
        for (int i = 0; i < 15; i++) {
            if (i == 1) { // indexing starting from 0 till 21
                t9.add(-1);
                continue;
            }
            if (i == 12) {
                t9.add(1);
                continue;
            }
            t9.add(0);
        }
        incidenceMatrix.add(t9);

        ArrayList<Integer> t10 = new ArrayList<Integer>(); // for transition 10
        for (int i = 0; i < 15; i++) {
            if (i == 5) { // indexing starting from 0 till 21
                t10.add(-1);
                continue;
            }
            if (i == 1) {
                t10.add(1);
                continue;
            }
            t10.add(0);
        }
        incidenceMatrix.add(t10);

        ArrayList<Integer> t11 = new ArrayList<Integer>(); // for transition 7
        for (int i = 0; i < 15; i++) {
            if (i == 9) { // indexing starting from 0 till 21
                t11.add(-1);
                continue;
            }
            if (i == 5) {
                t11.add(1);
                continue;
            }
            t11.add(0);
        }
        incidenceMatrix.add(t11);

        ArrayList<Integer> t12 = new ArrayList<Integer>(); // for transition 7
        for (int i = 0; i < 15; i++) {
            if (i == 12) { // indexing starting from 0 till 21
                t12.add(-1);
                continue;
            }
            if (i == 9) {
                t12.add(1);
                continue;
            }
            t12.add(0);
        }
        incidenceMatrix.add(t12);

        ArrayList<Integer> t13 = new ArrayList<Integer>(); // for transition 7
        for (int i = 0; i < 15; i++) {
            if (i == 11) { // indexing starting from 0 till 21
                t13.add(-1);
                continue;
            }
            if (i == 0) {
                t13.add(1);
                continue;
            }
            t13.add(0);
        }
        incidenceMatrix.add(t13);

        ArrayList<Integer> t14 = new ArrayList<Integer>(); // for transition 14
        for (int i = 0; i < 15; i++) {
            if (i == 0) { // indexing starting from 0 till 21
                t14.add(-1);
                continue;
            }
            if (i == 4) {
                t14.add(1);
                continue;
            }
            t14.add(0);
        }
        incidenceMatrix.add(t14);

        ArrayList<Integer> t15 = new ArrayList<Integer>(); // for transition 15
        for (int i = 0; i < 15; i++) {
            if (i == 4) { // indexing starting from 0 till 21
                t15.add(-1);
                continue;
            }
            if (i == 7 || i == 8) {
                t15.add(1);
                continue;
            }
            t15.add(0);
        }
        incidenceMatrix.add(t15);

        ArrayList<Integer> t16 = new ArrayList<Integer>(); // for transition t16
        for (int i = 0; i < 15; i++) {
            if (i == 8) { // indexing starting from 0 till 21
                t16.add(-1);
                continue;
            }
            if (i == 11) {
                t16.add(1);
                continue;
            }
            t16.add(0);
        }
        incidenceMatrix.add(t16);

        ArrayList<Integer> t17 = new ArrayList<Integer>(); // for transition t17
        for (int i = 0; i < 15; i++) {
            if (i == 7) { // indexing starting from 0 till 21
                t17.add(-1);
                continue;
            }
            if (i == 11) {
                t17.add(1);
                continue;
            }
            t17.add(0);
        }
        incidenceMatrix.add(t17);

        ArrayList<Integer> t18 = new ArrayList<Integer>(); // for transition t18
        for (int i = 0; i < 15; i++) {
            if ( i == 11 || i == 12 || i == 14 || i == 2) {
                t18.add(-1);
                continue;
            }
            if (i == 3) {
                t18.add(1);
                continue;
            }
            t18.add(0);
        }
        incidenceMatrix.add(t18);

        ArrayList<Integer> t19 = new ArrayList<Integer>(); // for transition t19
        for (int i = 0; i < 15; i++) {
            if (i == 3) { // indexing starting from 0 till 21
                t19.add(-1);
                continue;
            }
            if (i == 11 || i == 12 || i == 13 || i == 14)  {
                t19.add(1);
                continue;
            }
            t19.add(0);
        }
        incidenceMatrix.add(t19);

        ArrayList<Integer> t20 = new ArrayList<Integer>(); // for transition t20
        for (int i = 0; i < 15; i++) {
            if (i == 11 || i == 12 || i == 13 || i == 14) { // indexing starting from 0 till 21
                t20.add(-1);
                continue;
            }
            if (i == 3) {
                t20.add(1);
                continue;
            }
            t20.add(0);
        }
        incidenceMatrix.add(t20);

        ArrayList<Integer> t21 = new ArrayList<Integer>(); // for transition t21
        for (int i = 0; i < 15; i++) {
            if (i == 3) { // indexing starting from 0 till 21
                t21.add(-1);
                continue;
            }
            if (i == 11 || i == 12 || i == 13 || i == 14) {
                t21.add(1);
                continue;
            }
            t21.add(0);
        }
        incidenceMatrix.add(t21);

        ArrayList<Integer> t22 = new ArrayList<Integer>(); // for transition t22
        for (int i = 0; i < 15; i++) {
            if (i == 3) { // indexing starting from 0 till 21
                t22.add(-1);
                continue;
            }
            if (i == 2) {
                t22.add(1);
                continue;
            }
            t22.add(0);
        }
        incidenceMatrix.add(t22);

        ArrayList<Integer> t23 = new ArrayList<Integer>(); // for transition t23
        for (int i = 0; i < 15; i++) {
            if (i == 11 || i == 12) { // indexing starting from 0 till 21
                t23.add(-1);
                continue;
            }
            if (i == 8) {
                t23.add(1);
                continue;
            }
            t22.add(0);
        }
        incidenceMatrix.add(t23);
        ArrayList<Integer> t24 = new ArrayList<Integer>(); // for transition t24
        for (int i = 0; i < 15; i++) {
            if (i == 8) { // indexing starting from 0 till 21
                t24.add(-1);
                continue;
            }
            if (i == 5) {
                t24.add(1);
                continue;
            }
            t24.add(0);
        }
        incidenceMatrix.add(t24);
    }
}
