package isp.violation.password_hasher;
public interface PasswordHasher
{
    String hashPassword(String password);
    String decodePasswordFromHash(String hash);
}
