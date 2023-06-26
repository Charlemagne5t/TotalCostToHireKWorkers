import java.util.*;

public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int left = candidates - 1;
        int right = costs.length - candidates;
        long result = 0L;

        PriorityQueue<Integer> leftSubArray = new PriorityQueue<>();
        PriorityQueue<Integer> rightSubArray = new PriorityQueue<>();
        if (left < right) {
            for (int i = 0; i <= left; i++) {
                leftSubArray.add(costs[i]);
            }

            for (int i = right; i < costs.length; i++) {
                rightSubArray.add(costs[i]);
            }
        } else {
            for (int i = 0; i < costs.length; i++) {
                if (i < candidates) {
                    leftSubArray.add(costs[i]);
                } else rightSubArray.add(costs[i]);
            }
        }

        while (k != 0) {
            if (rightSubArray.isEmpty() && leftSubArray.isEmpty()) {
                break;
            } else if (rightSubArray.isEmpty()) {
                result += leftSubArray.poll();
            } else if (leftSubArray.isEmpty()) {
                result += rightSubArray.poll();
            } else if (rightSubArray.peek() < leftSubArray.peek()) {
                result = result + rightSubArray.poll();
                if (right - 1 > left) {
                    right--;
                    rightSubArray.add(costs[right]);
                }

            } else {
                result = result + leftSubArray.poll();
                if (left + 1 < right) {
                    left++;
                    leftSubArray.add(costs[left]);
                }
            }
            k--;
        }

        return result;
    }

}
