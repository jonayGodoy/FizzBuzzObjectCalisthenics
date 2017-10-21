import java.util.ArrayList;
import java.util.List;

class FizzBuzz {

    private List<WrapperFizzBuzz> list100;

    FizzBuzz() {
        generateList();
    }

    private void generateList() {
        list100 = new ArrayList<>(101);
        list100.add(0, new WrapperFizzBuzz(new WrapperString("")));
        for(int i = 0; i < 100;i++){
            list100.add(i+1,new WrapperFizzBuzz(new WrapperString(String.valueOf(i+1))));
        }
    }

    WrapperFizzBuzz returnPosition(int position) {
        return list100.get(position);
    }
}
