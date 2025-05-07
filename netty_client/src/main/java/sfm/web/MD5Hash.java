package sfm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;


public final class MD5Hash extends Security {
    private static final Logger logger = LoggerFactory.getLogger(MD5Hash.class);
    private MessageDigest md5 = null;

    public MD5Hash() {
        try {
            this.md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            logger.error("MD5Hash", e);
        }
    }

    @Override
    public byte[] doUpdate(byte[] o) {
        if (md5 != null) {
            md5.update(o, 0, o.length);
        }
        return o;
    }

    @Override
    public byte[] doFinal(byte[] digest) {
        if (md5 != null) {
            byte[] md5digest = md5.digest();
            System.arraycopy(md5digest, 0, digest, 0, digest.length);
        }
        return digest;
    }

    public static byte[] doDigest(byte[] o) {
        try {
            return MessageDigest.getInstance("MD5").digest(o);
        } catch (Exception e) {
            logger.error("doDigest", e);
            return new byte[0];
        }
    }
}
