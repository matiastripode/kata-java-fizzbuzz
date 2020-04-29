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
        Assert.assertEquals("0", fizzbuzz(0));
        Assert.assertEquals("1", fizzbuzz(1));
        Assert.assertEquals("2", fizzbuzz(2));
        Assert.assertEquals("4", fizzbuzz(4));
    }

    @Test
    public void test_fizzbuzz_of_divisible_by_5_should_return_fizz() {
        Assert.assertEquals("fizz", fizzbuzz(3));
        Assert.assertEquals("fizz", fizzbuzz(6));
        Assert.assertEquals("fizz", fizzbuzz(9));
    }

    @Test
    public void test_fizzbuzz_of_divisible_by_5_should_return_buzz() {
        Assert.assertEquals("buzz", fizzbuzz(5));
        Assert.assertEquals("buzz", fizzbuzz(10));
        Assert.assertEquals("buzz", fizzbuzz(20));
        Assert.assertEquals("buzz", fizzbuzz(35));
    }


    @Test
    public void test_fizzbuzz_of_divisible_by_3_and_5_should_return_fizzbuzz() {
        Assert.assertEquals("fizzbuzz", fizzbuzz(15));
        Assert.assertEquals("fizzbuzz", fizzbuzz(30));
        Assert.assertEquals("fizzbuzz", fizzbuzz(90));
    }


    private String fizzbuzz(int i) {
        if (i == 0) return String.valueOf(i);
        else if (i % 3 == 0 && i % 5 == 0) return "fizzbuzz";
        else if (i % 3 == 0) return "fizz";
        else if (i % 5 == 0) return "buzz";
        else return String.valueOf(i);
    }
}