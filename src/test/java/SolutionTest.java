import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void totalCostTest1() {
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3;
        int candidates = 4;
        long expected = 11L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalCostTest2() {
        int[] costs = {1, 2, 4, 1};
        int k = 3;
        int candidates = 3;
        long expected = 4L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalCostTest3() {
        int[] costs = {31,25,72,79,74,65,84,91,18,59,27,9,81,33,17,58};
        int k = 11;
        int candidates = 2;
        long expected = 423L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalCostTest4() {
        int[] costs = {50,80,34,9,86,20,67,94,65,82,40,79,74,92,84,37,19,16,85,20,79,25,89,55,67,84,3,79,38,16,44,2,54,58};
        int k = 7;
        int candidates = 12;
        long expected = 95L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void totalCostTest5() {
        int[] costs = {28,35,21,13,21,72,35,52,74,92,25,65,77,1,73,32,43,68,8,100,84,80,14,88,42,53,98,69,64,40,60,23,99,83,5,21,76,34};
        int k = 32;
        int candidates = 12;
        long expected = 1407L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void totalCostTest6() {
        int[] costs = {18,64,12,21,21,78,36,58,88,58,99,26,92,91,53,10,24,25,20,92,73,63,51,65,87,6,17,32,14,42,46,65,43,9,75};
        int k = 13;
        int candidates = 23;
        long expected = 223L;
        long actual = new Solution().totalCost(costs, k, candidates);
        Assert.assertEquals(expected, actual);
    }
}
