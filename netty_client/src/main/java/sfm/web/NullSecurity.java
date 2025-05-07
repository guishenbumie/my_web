package sfm.web;


public final class NullSecurity extends Security {

    private NullSecurity() {
    }

    public static final NullSecurity NULLSECURITY = new NullSecurity();
}