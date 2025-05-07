package sfm.web;


public final class Random extends Security {
    private static java.util.Random nonce = new java.util.Random();

    @Override
    public byte[] doUpdate(byte[] o) {
        nonce.nextBytes(o);
        return o;
    }

    static {
        nonce.setSeed(System.currentTimeMillis());
    }
}