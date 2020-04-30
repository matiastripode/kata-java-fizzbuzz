import org.junit.Test;
import org.junit.Assert;

/*
* Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz”
* instead of the number and for the multiples of five print “Buzz”.
* For numbers which are multiples of both three and five print “FizzBuzz “.
* */
public class FizzbuzzTest {


    @Test
    public void test_fizzbuzz_of_non_divisible_by_3_nor_by_5_should_return_number() {
        Assert.assertEquals("0", Fizzbuzz.compute(0));
        Assert.assertEquals("1", Fizzbuzz.compute(1));
        Assert.assertEquals("2", Fizzbuzz.compute(2));
        Assert.assertEquals("4", Fizzbuzz.compute(4));
    }

    @Test
    public void test_fizzbuzz_of_divisible_by_5_should_return_fizz() {
        Assert.assertEquals("fizz", Fizzbuzz.compute(3));
        Assert.assertEquals("fizz", Fizzbuzz.compute(6));
        Assert.assertEquals("fizz", Fizzbuzz.compute(9));
    }

    @Test
    public void test_fizzbuzz_of_divisible_by_5_should_return_buzz() {
        Assert.assertEquals("buzz", Fizzbuzz.compute(5));
        Assert.assertEquals("buzz", Fizzbuzz.compute(10));
        Assert.assertEquals("buzz", Fizzbuzz.compute(20));
        Assert.assertEquals("buzz", Fizzbuzz.compute(35));
    }


    @Test
    public void test_fizzbuzz_of_divisible_by_3_and_5_should_return_fizzbuzz() {
        Assert.assertEquals("fizzbuzz", Fizzbuzz.compute(15));
        Assert.assertEquals("fizzbuzz", Fizzbuzz.compute(30));
        Assert.assertEquals("fizzbuzz", Fizzbuzz.compute(90));
    }
}