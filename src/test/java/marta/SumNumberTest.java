package marta;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumberTest {

    SumNumber sn = new SumNumber();

    @Test
    public void shouldReturnSumTwoNumbers() {
        //Given
        int a = 10;
        int b = 15;
        //When
        int result = sn.sumPositiveNumbers(a, b);
        //Then
        Assert.assertThat(result, Is.is(25));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNotPositive() {

       // sn.sumPositiveNumbers(-2,3)0
        try {
            sn.sumPositiveNumbers(-1, 5);
            fail("Exception wasn't fail");
        } catch (IllegalArgumentException ex) {
            Assert.assertEquals("You can write only positive numbers", ex.getMessage());
        }
    }

}