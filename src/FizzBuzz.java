import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    private List<WrapperFizzBuzz> list100;

    FizzBuzz() {
        list100 = new ArrayList<>(101);
        for(int i = 0; i < 100;i++){
            list100.add(i,new WrapperFizzBuzz(new WrapperString(String.valueOf(i))));
        }
    }


    WrapperFizzBuzz returnPosition(int position) {
        return list100.get(position);
    }
}
