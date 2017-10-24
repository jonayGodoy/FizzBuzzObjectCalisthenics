public class WrapperBoolean {

    @Override
    public int hashCode() {
        return (state ? 1 : 0);
    }

    static WrapperBoolean and(WrapperBoolean a, WrapperBoolean b){
        return  Factory.generateWBoolean(a.state && b.isState());
    }

    static WrapperBoolean not(WrapperBoolean a){
        return  Factory.generateWBoolean(!a.isState());
    }

    static WrapperBoolean or(WrapperBoolean a, WrapperBoolean b) {
        return  Factory.generateWBoolean(a.state || b.isState());
    }

    private boolean state;

    WrapperBoolean(boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperBoolean that = (WrapperBoolean) o;

        return state == that.state;
    }

    static WrapperBoolean True(){
        return Factory.generateWBoolean(true);
    }

    private boolean isState() {
        return state;
    }
}
