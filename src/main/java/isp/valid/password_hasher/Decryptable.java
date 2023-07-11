package isp.valid.password_hasher;

public interface Decryptable {
    String decodePasswordFromHash(String hash);
}
