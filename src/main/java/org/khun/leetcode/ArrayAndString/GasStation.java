package org.khun.leetcode.ArrayAndString;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int tank = 0;
        int start = 0;

        for (int g : gas) {
            totalGas += g;
        }
        for (int c : cost) {
            totalCost += c;
        }
        if (totalGas < totalCost) return -1;

        for (int i = 0; i < gas.length; i++) {
            tank += (gas[i] - cost[i]);
            if (tank < 0) {
                tank = 0;
                start = i + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        GasStation gs = new GasStation();

        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        System.out.println(gs.canCompleteCircuit(gas1, cost1));

        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        System.out.println(gs.canCompleteCircuit(gas2, cost2));

    }
}
