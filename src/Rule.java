public interface Rule {

    boolean match();
    WrapperString generateWrapperString();
}
