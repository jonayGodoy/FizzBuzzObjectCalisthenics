
public class WrapperString {

    static WrapperString convertWrapperString(WrapperNumber number) {
        return new WrapperString(number.toString());
    }

    static WrapperString empty() {
        return new WrapperString("");
    }

    private String s;

    WrapperString(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WrapperString that = (WrapperString) o;

        return s != null ? s.equals(that.s) : that.s == null;
    }

    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }
}
