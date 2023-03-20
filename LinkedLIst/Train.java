// // There are two train TrainE and TrainF. Each train has 5 compartments.
// // Each compartment has passengers from following states: Uttar Pradesh,Himachal Pradesh, Gujarat, Maharashtra, Kerala.
// //  There is one restriction that for each state citizens there is one dedicated compartment only,
// //  irrespective of sequence of compartment, like if Maharashtra state citizens are sitting in compartment 2nd,
// //  all of them will sit only there. Bookings will not allow in any other compartment for them,
// //  and there is no guarantee that if TrainE reserves booking of Maharashtra citizen in compartment 2nd, 
// // TrainF will do same, may be TrainF reserves booking of Maharashtra citizen in compartment 1st or in 2nd or in 3rd, and so on. 
// // Indian railways want to know that how many citizens of each states, state-wise, are travelling in both trains. 
// // Write a java program to implement this structure and perform this operation.


// import java.util.LinkedList;

// public class Train {
//     private LinkedList<Compartment> compartments;

//     public Train() {
//         compartments = new LinkedList<>();
//         for (int i = 1; i <= 5; i++) {p
//             compartments.add(new Compartment(i));
//         }
//     }

//     public void reserveCompartment(String state, int compartment) {
//         if (compartment < 1 || compartment > 5) {
//             System.out.println("Invalid compartment number.");
//         } else {
//             compartments.get(compartment - 1).reserve(state);
//         }
//     }

//     public String getState(int compartment) {
//         return compartments.get(compartment - 1).getState();
//     }

//     private class Compartment {
//         private int number;
//         private String state;

//         public Compartment(int number) {
//             this.number = number;
//             this.state = "";
//         }

//         public void reserve(String state) {
//             if (this.state.isEmpty()) {
//                 this.state = state;
//             } else {
//                 System.out.println("Compartment already reserved for " + this.state);
//             }
//         }

//         public String getState() {
//             return state;
//         }
//     }

//     public static void main(String[] args) {
//         Train trainE = new Train();
//         Train trainF = new Train();

//         trainE.reserveCompartment("Uttar Pradesh", 1);
//         trainE.reserveCompartment("Himachal Pradesh", 2);
//         trainE.reserveCompartment("Gujarat", 3);
//         trainE.reserveCompartment("Maharashtra", 4);
//         trainE.reserveCompartment("Kerala", 5);

//         trainF.reserveCompartment("Uttar Pradesh", 3);
//         trainF.reserveCompartment("Himachal Pradesh", 1);
//         trainF.reserveCompartment("Gujarat", 2);
//         trainF.reserveCompartment("Maharashtra", 5);
//         trainF.reserveCompartment("Kerala", 4);

//         HashMap<String, Integer> stateCount = new HashMap<>();
//         stateCount.put("Uttar Pradesh", 0);
//         stateCount.put("Himachal Pradesh", 0);
//         stateCount.put("Gujarat", 0);
//         stateCount.put("Maharashtra", 0);
//         stateCount.put("Kerala", 0);

//         for (int i = 1; i <= 5; i++) {
//             String state = trainE.getState(i);
//             if (!state.isEmpty()) {
//                 stateCount.replace(state, stateCount.get(state) + 1);
//             }
//         }

//         for (int i = 1; i <= 5; i++) {
//             String state = trainF.getState(i);
//             if (!state.isEmpty()) {
//                 stateCount.replace(state, stateCount.get(state) + 1);
//             }
//         }

//         System.out.println("State-wise passenger count:");
//         for (String state : stateCount.keySet
