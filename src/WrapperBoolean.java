public class WrapperBoolean {

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

    @Override
    public int hashCode() {
        return (state ? 1 : 0);
    }

    static WrapperBoolean and(WrapperBoolean a, WrapperBoolean b){
        return  Factory.generateBoolean(a.state && b.isState());
    }

    static WrapperBoolean not(WrapperBoolean a){
        return  Factory.generateBoolean(!a.isState());
    }

    static WrapperBoolean True(){
        return Factory.generateBoolean(true);
    }

    private boolean isState() {
        return state;
    }
}
