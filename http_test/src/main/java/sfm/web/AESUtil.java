package sfm.web;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

class AESUtil {
    private static String sKey = "0df2aff36b49875b96eed999ab747c48"; //密钥是string类型 长度是16、24、32
    private static String ivParameter = sKey.substring(4, 20); ; //偏移量是密钥截取16位，也是string类型
    static String encrypt(String str) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] raw = sKey.getBytes();  // 密钥转成byte
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes()); //偏移量转成byte
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
            byte[] encrypted = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encrypted); //base64编码
        } catch (Exception ex) {
            return null;
        }
    }

    static String decrypt(String str) throws Exception {
        try {
            byte[] raw = sKey.getBytes();
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes()); //偏移量
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 = Base64.getDecoder().decode(str);
            byte[] original = cipher.doFinal(encrypted1);
            return new String(original, StandardCharsets.UTF_8);
        } catch (Exception ex) {
            return null;
        }
    }
}

