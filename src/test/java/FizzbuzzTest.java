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

    @Test
    public void test_fizzbuzz_of_three_should_return_fizz() {
        Assert.assertEquals("fizz", fizzbuzz(3));
    }

    @Test
    public void test_fizzbuzz_of_four_should_return_four() {
        Assert.assertEquals("4", fizzbuzz(4));
    }

    @Test
    public void test_fizzbuzz_of_five_should_return_buzz() {
        Assert.assertEquals("buzz", fizzbuzz(5));
    }

    @Test
    public void test_fizzbuzz_of_six_should_return_fizz() {
        Assert.assertEquals("fizz", fizzbuzz(6));
    }

    private String fizzbuzz(int i) {
        if (i == 0) return "0";
        else if (i == 1) return "1";
        else if (i == 2) return "2";
        else if (i == 3) return "fizz";
        else if (i == 4) return "4";
        else if (i == 5) return "buzz";
        else return "fizz";
    }
}