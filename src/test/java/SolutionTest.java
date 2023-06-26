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
}
