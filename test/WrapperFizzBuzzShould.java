import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;

public class WrapperFizzBuzzShould {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    private void assertThatPositionIs(int position,String s){
        assertThat(new WrapperFizzBuzz(new WrapperNumber(position)).getContent(), is(new WrapperString(s)));
    }

    @Test
    public void testGreen() throws Exception {
        assertThat(true, is(true));
    }
    @Test
    public void first_position_them_1(){
        assertThatPositionIs(1,"1");
    }

    @Test
    public void second_position_them_2() throws Exception {
        assertThatPositionIs(2,"2");
    }

    @Test
    public void fourth_position_them_4() throws Exception {
        assertThatPositionIs(4,"4");
    }

    @Test
    public void zero_position_them_empty() throws Exception {
        assertThatPositionIs(0,"");
    }

    @Test
    public void thirst_position_them_3() throws Exception {
        assertThatPositionIs(3,"Fizz");
    }

}
