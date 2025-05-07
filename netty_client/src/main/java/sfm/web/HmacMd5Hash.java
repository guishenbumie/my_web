package sfm.web;


public final class HmacMd5Hash extends Security {
    private final byte[] kOpad = new byte[64];
    private final MD5Hash md5hash = new MD5Hash();

    @Override
    public void setParameter(byte[] param) {
        byte[] ipad = new byte[64];
        int keylen = param.length;
        if (keylen > 64) {
            param = MD5Hash.doDigest(param);
            keylen = param.length;
        }
        System.arraycopy(param, 0, ipad, 0, keylen);
        System.arraycopy(param, 0, kOpad, 0, keylen);

        int i;
        for (i = 0; i < keylen; ++i) {
            ipad[i] = (byte) (ipad[i] ^ 54);
            kOpad[i] = (byte) (kOpad[i] ^ 92);
        }

        while (i < 64) {
            ipad[i] = (byte) 54;
            kOpad[i] = (byte) 92;
            ++i;
        }

        md5hash.doUpdate(ipad);
    }

    @Override
    public byte[] doUpdate(byte[] o) {
        this.md5hash.doUpdate(o);
        return o;
    }

    @Override
    public byte[] doFinal(byte[] digest) {
        this.md5hash.doFinal(digest);
        MD5Hash ctx = new MD5Hash();
        ctx.doUpdate(this.kOpad);
        ctx.doUpdate(digest);
        return ctx.doFinal(digest);
    }
}
