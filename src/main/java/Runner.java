import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");


//        2. Add "Tiree" to the start of the list
        scottishIslands.add("Tiree");

        String island = "Tiree";
        int islandPos = scottishIslands.indexOf(island);
        scottishIslands.remove(islandPos);
        scottishIslands.add(0, island);
        System.out.println(scottishIslands);


//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add("Islay");
        String islayIsle = "Islay";
        int islayIslePos = scottishIslands.indexOf(islayIsle);
        scottishIslands.remove(islayIslePos);
        scottishIslands.add(2, islayIsle);
        System.out.println(scottishIslands);

//        4. Print out the index position of "Skye"
        System.out.println("Index of Skye:" + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
        System.out.println(scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println("Number of Islands:" + scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("In Alphabetical Order: " + scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("Island's in a for loop: ");
        for (String scottishIsland : scottishIslands) {
            System.out.println(scottishIsland);
        }


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int[] daNumbers = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 0; i < daNumbers.length; i++) {
            if (daNumbers[i] % 2 == 0) {
                even.add(daNumbers[i]);
            }
        }
        System.out.println(even);

//        2. Print the difference between the largest and smallest value
        int maximum = daNumbers[0];
        int minimum = daNumbers[0];
        for (int i = 1; i < daNumbers.length; i++) {
            if (daNumbers[i] > maximum)
                maximum = daNumbers[i];
            else if (daNumbers[i] < minimum)
                minimum = daNumbers[i];

        }
        System.out.println("difference between the largest and smallest value is: " + (maximum - minimum));


//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 0; i < daNumbers.length - 1; i++){
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1){
                boolean result = true;
                System.out.println("numbers contains 1 next to a 1 is: " + result);
            }
        }
        //       4. Print the sum of the numbers,
        int sumOfNumbers = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumOfNumbers = sumOfNumbers + numbers.get(i);
        }
        System.out.println("Sum of numbers = " + sumOfNumbers);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.
        int total = 0;
        for (int number : numbers){
            if(number == 13){
                break;
            }
            total += number;
        }
        System.out.println("Sum of Numbers without 13: " + total);
    }
    }
