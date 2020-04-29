import org.junit.Test;
import org.junit.Assert;

/*
* Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
* instead of the number and for the multiples of five print “Buzz”.
* For numbers which are multiples of both three and five print “FizzBuzz “.
* */
public class FizzbuzzTest {
    @Test
    public void test_fizzbuzz_of_zero_should_return_zero() {
        Assert.assertEquals("0", fizzbuzz(0));
    }

    @Test
    public void test_fizzbuzz_of_one_should_return_one() {
        Assert.assertEquals("1", fizzbuzz(1));
    }

    @Test
    public void test_fizzbuzz_of_two_should_return_two() {
        Assert.assertEquals("2", fizzbuzz(2));
    }


    private String fizzbuzz(int i) {
        if (i == 0) return "0";
        else if (i == 1) return  "1";
        else return "2";
    }
}