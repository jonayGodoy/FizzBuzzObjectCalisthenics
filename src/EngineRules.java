import java.util.ArrayList;
import java.util.List;

class EngineRules {

    private List<Rule> rules ;

    public EngineRules() {
        rules = new ArrayList<>();
    }

    public void addRule(Rule rule){
        rules.add(rule);
    }

    public WrapperString executeAll(){
        for (Rule rule : rules) {
            if(rule.match()){return rule.generateWrapperString();}}

        return WrapperString.empty();
    }

}
