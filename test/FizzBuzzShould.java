import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class FizzBuzzShould {
    @Test
    public void testGreen() throws Exception {
        assertThat(true, is(true));
    }
    @Test
    public void first_position_them_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.returnPosition(1), is(new WrapperFizzBuzz(new WrapperString("1"))));
    }

    @Test
    public void second_position_them_2() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.returnPosition(2), is(new WrapperFizzBuzz(new WrapperString("2"))));
    }

}
