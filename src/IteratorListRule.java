import java.util.List;

class IteratorListRule{

    private List<Rule> ruleList;
    private boolean isNext = true;
    private int positionCurrentRule;

    IteratorListRule(List<Rule> ruleList) {
        this.positionCurrentRule = 0;
        this.ruleList = ruleList;
    }

    Rule nextRule(){
        Rule currentRule = ruleList.get(positionCurrentRule);
        isNext = !currentRule.match();
        positionCurrentRule++;

        return currentRule;
    }

    boolean hasNextRule(){
        return  isNext && isEndList();
    }

    private boolean isEndList() {
        return positionCurrentRule < ruleList.size();
    }
}
