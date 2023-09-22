public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 3, -1, -1, 3, 7};
        int[] array2 = {3, 3, 0, 1, 0 , 1, 5};

        Exercise1 solution = new Exercise1();
        int answ1 = solution.singleNumber(array1);
        int answ2 = solution.singleNumber(array2);
        System.out.println("the number that does not repeat is: " + answ1);  //output is 7
        System.out.println("the number that does not repeat is: " + answ2);  //output is 5


        Exercise2 exercise2 = new Exercise2();
        int amount1 = 98;
        int amount2 = 1008;
        int numCoins1 = exercise2.minSplit(amount1);
        int numCoins2 = exercise2.minSplit(amount2);
        System.out.println("minimum number of coins needed: " + numCoins1); // output is 7
        System.out.println("minimum number of coins needed: " + numCoins2); // output is 24



        Exercise3 exercise3 = new Exercise3();
        int[] check1 = {1, 3, 6, 4, 1, 2};
        int[] check2 = {-1,-4,5,4,10,11};
        int result1 = exercise3.notContains(check1);
        int result2 = exercise3.notContains(check2);
        System.out.println("the smallest positive integer not in the array is: " + result1); // output is 5
        System.out.println("the smallest positive integer not in the array is: " + result2); //output is 14


        Exercise4 exercise4 = new Exercise4();
        String a1 = "1010";
        String b1 = "1011";
        String sum1 = exercise4.addBinary(a1,b1);

        String a2 = "11111";
        String b2 = "11001";
        String sum2 = exercise4.addBinary(a2,b2);
        System.out.println("sum of " + a1 + " and " + b1 + " is: " + sum1);
        System.out.println("sum of " + a2 + " and " + b2 + " is: " + sum2);


        Exercise5 exercise5 = new Exercise5();
        int stairsCount1 = 5; // Change this value to the desired number of stairs.
        int stairsCount2 = 11;
        int ways1 = exercise5.countVariants(stairsCount1);
        int ways2 = exercise5.countVariants(stairsCount2);
        System.out.println("number of ways to climb " + stairsCount1 + " stairs: " + ways1);  //output is 8
        System.out.println("number of ways to climb " + stairsCount2 + " stairs: " + ways2);  //output is 144



        Exercise6<Integer> exercise6 = new Exercise6<>();
        exercise6.add(1);
        exercise6.add(2);
        exercise6.add(3);

        System.out.println("elements in the data structure: " + exercise6.elementMap.keySet()); // output is [1,2,3]
        System.out.println("size of the data structure: " + exercise6.size());   //output is 3

        exercise6.delete(2);

        System.out.println("elements in the data structure after deleting 2: " + exercise6.elementMap.keySet());  //output is [1,3]
        System.out.println("size of the data structure after deleting 2: " + exercise6.size());    //output is 2

        System.out.println("random element: " + exercise6.getRandom());   //output is 3

    }


}