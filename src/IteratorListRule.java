import java.util.List;

public class IteratorListRule{

    private int positionCurrentRule;
    private List<Rule> ruleList;
    private boolean isNext = true;

    IteratorListRule(List<Rule> ruleList) {
        this.positionCurrentRule = 0;
        this.ruleList = ruleList;
    }

    boolean hasNextRule(){
        return  isNext && positionCurrentRule < ruleList.size();
    }

    Rule nextRule(){
        Rule currentRule = ruleList.get(positionCurrentRule);
        isNext = !currentRule.match();
        positionCurrentRule++;

        return currentRule;
    }
}
