import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WrapperFizzBuzzShould {

    private void assertThatPositionIs(int position,String s){
        assertThat(new WrapperFizzBuzz(Factory.generateWNumber(position)).getContent(), is(Factory.generateWString(s)));
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
    public void multiple_of_three_position_them_Fizz() throws Exception {
        assertThatPositionIs(3,"Fizz");
    }

    @Test
    public void multiple_of_five_position_them_Buzz() throws Exception {
        assertThatPositionIs(5,"Buzz");
    }

    @Test
    public void multiple_of_fifteen_position_them_FizzBuzz() throws Exception {
        assertThatPositionIs(15,"FizzBuzz");
    }

    @Test
    public void multiple_of_fifty_one_position_them_FizzBuzz() throws Exception {
        assertThatPositionIs(51,"FizzBuzz");
    }

    @Test
    public void multiple_of_fifty_two_position_them_Buzz() throws Exception {
        assertThatPositionIs(52,"Buzz");
    }

    @Test
    public void multiple_of_thirteen_position_them_Fizz() throws Exception {
        assertThatPositionIs(13,"Fizz");
    }
}
