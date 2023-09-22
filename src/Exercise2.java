public class Exercise2 {
    public int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1}; // possible coins
        int numCoins = 0; // amount of used coins
        for (int coin : coins) {
            // here i calculate the amount of used current coin
            int num = amount / coin;
            //updating amount and the number of used coins
            amount -= num *  coin;
            numCoins += num;
        }
        return numCoins;
    }

}
