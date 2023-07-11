package ocp.valid.password_hasher;

public class Md5PasswordHasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "hashed with SHA256";
    }
}