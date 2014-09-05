
package com.tutk.common;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Utils {
    final private static char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    public static String genHMacMD5(final String key, final String source) {
        try {
            Mac mac = Mac.getInstance("HmacMD5");
            SecretKeySpec secreKeySpec = new SecretKeySpec(key.getBytes(), mac.getAlgorithm());
            mac.init(secreKeySpec);
            byte[] result = mac.doFinal(source.getBytes());
            return bytesToHex(result);
        } catch (NoSuchAlgorithmException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (InvalidKeyException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    public static String bytesToHex(byte[] data) {
        char[] hexChars = new char[data.length * 2];
        for (int j = 0; j < data.length; j++) {
            int v = data[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
}
