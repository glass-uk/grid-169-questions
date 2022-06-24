package weekone;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    void twoSumTarget9() {
        assertThat(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9), is(new int[]{0, 1}));
    }

    @Test
    void twoSumTarget6() {
        assertThat(twoSum.twoSum(new int[]{3, 2, 4}, 6), is(new int[]{1, 2}));
    }

    @Test
    void twoSumTarget6_v2() {
        assertThat(twoSum.twoSum(new int[]{3, 3}, 6), is(new int[]{0, 1}));
    }
}
