import java.util.ArrayList;
import java.util.List;

class EngineRules {

    private List<Rule> rules ;

    EngineRules() {
        rules = new ArrayList<>();
    }

    void addRule(Rule rule){
        rules.add(rule);
    }

     WrapperString executeAll(){
        WrapperString result = WrapperString.empty();

        IteratorListRule iteratorListRule = new IteratorListRule(rules);
        while(iteratorListRule.hasNextRule()){
           Rule rule = iteratorListRule.nextRule();
           result = rule.generateWrapperString();
        }

        return result;
    }

}
